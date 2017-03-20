package com.xgkj.mymvp.net;

import android.content.Context;
import android.util.Log;

import java.io.IOException;

import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okio.Buffer;

/**
 * @method
 * @date 2016/11/7 11:34
 * @description 缓存拦截器
 */
public class CaheInterceptor implements Interceptor {

    private Context context;
    private String cacheControlValue;
    private String cacheOnlineControlValue;
    //set cahe times is 3 days
    private static final int maxStale = 60 * 60 * 24 * 3;
    // read from cache for 60 s
    private static final int maxOnlineStale = 60;

    public CaheInterceptor(Context context) {
        this(context, String.format("max-stale=%d", maxOnlineStale));
    }

    public CaheInterceptor(Context context, String cacheControlValue) {

        this(context, cacheControlValue, String.format("max-stale=%d", maxStale));


    }

    public CaheInterceptor(Context context, String cacheControlValue,
            String cacheOnlineControlValue) {
        this.context = context;
        this.cacheControlValue = cacheControlValue;
        this.cacheOnlineControlValue = cacheOnlineControlValue;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        if (NetworkUtil.isNetworkAvailable(context)) {
            Response response = chain.proceed(request);
//            boolean responseOK = false;
//            int numTries = 0;
//            while (!responseOK && numTries < 3) {
//
//                try {
//                    response = chain.proceed(request);
//                    responseOK = response.isSuccessful();
//                } catch (SocketTimeoutException e) {
//                    LogUtil.eLog("<-- HTTP FAILED: " + e);
////                    throw e;
//                } finally {
//                    numTries++;
//                }
//            }

            String cacheControl = request.cacheControl().toString();
            Log.e("GoHttp", maxOnlineStale + ":not load cahe" + cacheControl);

            return response.newBuilder()
//                    .body(new ProgressResponseBody(response.body(), progressListener))//下载进度
                    .removeHeader("Pragma")
                    .removeHeader("Cache-Control")
                    .header("Cache-Control", "public, max-age=" + 2) // 两秒内 拿缓存
                    .build();
        } else {
            Log.e("GoHttp", " no network load cahe");
            request = request.newBuilder()
                    .cacheControl(CacheControl.FORCE_CACHE)
                    .build();
            Response response = chain.proceed(request);
            return response.newBuilder()
                    .removeHeader("Pragma")
                    .removeHeader("Cache-Control")
                    .header("Cache-Control", "public, only-if-cached, " + cacheControlValue)
                    .build();
        }
    }

    private static String bodyToString(final Request request) {
        try {
            final Request copy = request.newBuilder().build();
            final Buffer buffer = new Buffer();
            copy.body().writeTo(buffer);
            return buffer.readUtf8();
        } catch (final IOException e) {
            return "did not work";
        }
    }
}
