package com.example.kuljindersingh.fitnessworld.cardiodata;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.kuljindersingh.fitnessworld.R;

public class cardiodatafront extends Activity

{
    ImageView image;
    GridView grid;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardiofront);
        grid=(GridView)findViewById(R.id.grid);
        new Post_cardio(cardiodatafront.this,grid).execute();
    }
}
