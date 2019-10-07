package com.example.pro.myapplication;


import android.content.Intent;
import android.util.Log;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Controller {

    private PokedexListView view;

    static final String BASE_URL = "https://pokeapi.co/api/v2/";

    public Controller(PokedexListView mainActivity) {
        this.view = mainActivity;
    }

    public void start() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        RestApiPokemon restApiPokemon = retrofit.create(RestApiPokemon.class);

        Call<FirstResponse> call = restApiPokemon.getPokemon(0,151);
        call.enqueue(new Callback<FirstResponse>() {
            @Override
            public void onResponse(Call<FirstResponse> call, Response<FirstResponse> response) {
                if(response.isSuccessful()) {
                    List<Pokemon> pokemonList = response.body().getResults();
                    view.showList(pokemonList);
                } else {
                    System.out.println(response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<FirstResponse> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }
}