package com.hfad.scheduledlogs.network;

import retrofit2.Retrofit;

public class RetrofitInstance {
    public static final String BASE_PATH = "http://names.drycodes.com/1";

    public static Retrofit getInstance() {
        Retrofit mRetrofit = new Retrofit
                .Builder()
                .baseUrl(BASE_PATH)
                .build();

        return mRetrofit;
    }
}
