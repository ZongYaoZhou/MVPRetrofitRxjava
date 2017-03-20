package com.xgkj.mymvp.net;


import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;
import rx.Observable;

public interface BaseApiService {
    @FormUrlEncoded //用于Field or FielMap
    @POST("{url}")
    Observable<ResponseBody> executePost(
            @Path(value = "url", encoded = true) String url,
            @QueryMap Map<String, String> maps,
            @FieldMap Map<String, String> param);


    @FormUrlEncoded //post,弃用baseurl
    @POST
    Observable<ResponseBody> executeTPost(
            @Url String url, //使用完成URL
            @QueryMap Map<String, String> maps,
            @FieldMap Map<String, String> param);

    @POST
    @FormUrlEncoded
    @Headers("Accept: text/html,*/*")
    Observable<ResponseBody> executeTPost(
            @Url String url, //使用完成URL01
            @FieldMap Map<String, String> maps);


    @GET
    @Headers("Accept: text/html,*/*")
    Observable<ResponseBody> executeTGet(
            @Url String url, //使用完成URL
            @QueryMap Map<String, String> maps);

    @GET("{url}")
    Observable<ResponseBody> executeGet(
            @Path(value = "url", encoded = true) String url,
            @QueryMap Map<String, String> maps);

    @DELETE("{url}")
    Observable<ResponseBody> executeDelete(
            @Path(value = "url", encoded = true) String url,
            @QueryMap Map<String, String> maps);

    @PUT("{url}")
    Observable<ResponseBody> executePut(
            @Path(value = "url", encoded = true) String url,
            @QueryMap Map<String, String> maps);

    @Multipart
    @POST("{url}")
    Observable<ResponseBody> upLoadFile(
            @Path(value = "url", encoded = true) String url,
            @Part("image\"; filename=\"image.jpg") RequestBody requestBody);

    @Multipart
    @POST
    Observable<ResponseBody> upLoadFile(
            @Url String url,
            @QueryMap Map<String, String> param,
            @PartMap() Map<String, RequestBody> maps);

    @POST
    Observable<ResponseBody> upLoadFile_Body(
            @Url String url,
            @QueryMap Map<String, String> param,
            @Body() MultipartBody body);

    @Multipart
    @POST("{url}")
    Observable<ResponseBody> upLoadFile(
            @Path("url") String url,
            @FieldMap Map<String, String> usermaps,
            @Part("image") RequestBody requestBody);

    @Multipart
    @POST("{url}")
    Observable<ResponseBody> uploadFiles(
            @Path("url") String url,
            @Part("filename") String description,
            @PartMap() Map<String, RequestBody> maps);

    @Streaming
    @GET
    Observable<ResponseBody> downloadFile(@Url String fileUrl);


    @GET
    Observable<ResponseBody> getTest(@Url String fileUrl,
                                     @QueryMap Map<String, String> maps);

    @FormUrlEncoded
    @POST("{url}")
    Observable<ResponseBody> postFrom(
            @Path(value = "url", encoded = true) String url,
            @FieldMap Map<String, Object> maps);

}


