package com.example.kuljindersingh.fitnessworld.gymdata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.kuljindersingh.fitnessworld.R;


public class gymdatafront extends Activity

{
    ImageView image;
    GridView grid;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise);
        image=(ImageView)findViewById(R.id.storeimage);
        grid=(GridView)findViewById(R.id.grid);
        new Post_gym(gymdatafront.this,grid).execute();

    }
}
