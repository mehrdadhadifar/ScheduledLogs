package com.hfad.scheduledlogs.network;

import com.hfad.scheduledlogs.data.model.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NameService {
    @GET(".")
    Call<List<Log>> listItems(@Query("nameOptions")String options);
}
