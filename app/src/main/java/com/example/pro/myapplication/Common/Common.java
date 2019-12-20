package com.example.pro.myapplication.Common;

import android.graphics.Color;

import com.example.pro.myapplication.Adapter.PokemonEvolutionAdapter;
import com.example.pro.myapplication.Model.Pokedex;

import java.util.ArrayList;
import java.util.List;

public class Common {
    public static final String KEY_ENABLE_HOME = "enable_home";
    public static final String KEY_NUM_EVOLUTION = "num_evolution";
    public static List<com.example.pro.myapplication.Model.Pokemon> commonPokemonList = new ArrayList<>();

    public static int getColorByType(String type) {
        switch(type)
        {

            case "Normal":
                return Color.parseColor("#A4A27A");


            case "Dragon":
                return Color.parseColor("#743BFB");

            case "Flying":
                return Color.parseColor("#9985D2");

            case "Rock":
                return Color.parseColor("#A69133");

            case "Psychic":
                return Color.parseColor("#F15B85");


            case "Electric":
                return Color.parseColor("#E9CA3C");


            case "Ground":
                return Color.parseColor("#D9BF6C");


            case "Grass":
                return Color.parseColor("#81C85B");

            case "Poison":
                return Color.parseColor("#A441A3");



            case "Fire":
                return Color.parseColor("#F48130");


            case "Fighting":
                return Color.parseColor("#BE3027");


            case "Bug":
                return Color.parseColor("#A8B822");


            case "Ghost":
                return Color.parseColor("#705693");


            case "Ice":
                return Color.parseColor("#9BD8D8");


            case "Water":
                return Color.parseColor("#658FF1");

            case "Steel":
                return Color.parseColor("#BAB7D2");


            case "Fairy":
                return Color.parseColor("#DDA2DF");

            case "Dark":
                return Color.parseColor("#745945");

            default:
                return Color.parseColor("#658FA0");
        }
    }


    public static com.example.pro.myapplication.Model.Pokemon findPokemonByNum(String num) {
        for (com.example.pro.myapplication.Model.Pokemon pokemon:Common.commonPokemonList)
            if(pokemon.getNum().equals(num))
                return pokemon;
        return null;
    }
}
