package com.dsc.tesyant.sukacare;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit = null;
    private final static String BASE_URL = "http://demo5982865.mockable.io/mahasiswa";

    public static Retrofit getClient(String baseURl) {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


//    OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
//    final HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
//        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
//        okHttpClient.addInterceptor(logging);
//
//    Retrofit.Builder builder = new Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .client(okHttpClient.build());
//
//    Retrofit retrofit = builder.build();
//
//    UtilsApi client = retrofit.create(UtilsApi.class);
//    Call<LoginModel> call = client.getList();
//
//        call.enqueue(new Callback<LoginModel>() {
//        @Override
//        public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {
//            LoginModel loginModel = response.body();
//            int NimMhs = loginModel.getNim();
//
//        }
//
//        @Override
//        public void onFailure(Call<LoginModel> call, Throwable t) {
//
//        }
//    });
}
