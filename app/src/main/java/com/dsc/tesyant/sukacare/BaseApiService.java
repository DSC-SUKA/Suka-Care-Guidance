package com.dsc.tesyant.sukacare;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public abstract class BaseApiService {

    @FormUrlEncoded
    @POST("/NIM")
    abstract Call<ResponseBody> loginRequest(@Field("NIM") int NIM,
                                             @Field("PASSWORD") String PASSWORD);
}
