package com.example.pro.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.widget.ListView;

import java.util.List;

public class PokedexListView extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        Controller controller = new Controller(this);
        controller.start();
    }



    public void showList(List<Pokemon> pokemonList) {

    }

}
