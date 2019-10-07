package com.example.pro.myapplication;

import com.example.pro.myapplication.FirstResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RestApiPokemon {
    @GET("pokemon")
    Call<FirstResponse> getPokemon(@Query("offset") int status, @Query("limit") int limit);

}
