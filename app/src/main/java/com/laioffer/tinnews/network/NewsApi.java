package com.laioffer.tinnews.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import com.laioffer.tinnews.model.NewResponse;

public interface NewsApi {
    @GET("top-headlines")
    Call<NewResponse> getTopHeadlines(@Query("country") String country);

    @GET("everything")
    Call<NewResponse> getEverything(@Query("q") String query, @Query("pageSize") int pageSize);

}
