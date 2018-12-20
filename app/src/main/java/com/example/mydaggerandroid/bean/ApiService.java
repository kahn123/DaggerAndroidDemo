package com.example.mydaggerandroid.bean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public interface ApiService {

    @FormUrlEncoded
    @POST("post/post")
    Observable<String>  obtainString(@QueryMap Map<String,String> map);
}
