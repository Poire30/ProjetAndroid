package com.example.pro.myapplication.Retrofit;

import com.example.pro.myapplication.Model.Pokedex;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IPokemonDex {
    @GET("pokedex.json")
    Observable<Pokedex> getListPokemon();


}
