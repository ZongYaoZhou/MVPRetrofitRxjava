package com.xgkj.mymvp.net;

import okhttp3.ResponseBody;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by zhouzongyao on 2017/3/17.
 */

public interface ApiBaseService {
    public static final String baseUrl = "192.168.0.106/index.php/";

    //获取验证码
    @POST("api/Register/send_code")
    Observable<ResponseBody> getCapture(@Query("tel") String tel);

    //注册
    @POST("api/Register/register1")
    Observable<BaseResponse<String>> goRegister(@Query("tel") String tel,@Query("code") String code);

}
