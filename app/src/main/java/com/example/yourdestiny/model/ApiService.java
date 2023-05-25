package com.example.yourdestiny.model;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {
    @GET("/posts/{id}")
    public Call<User> getPostWithID(@Path("id") int id);

    @POST("/posts")
    public Call<User> postData(@Body User user);
}

