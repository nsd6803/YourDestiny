package com.example.yourdestiny.model;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ImgService {
    @GET("/v1/random")
    public Call<DataModel> getRandomData();

}
