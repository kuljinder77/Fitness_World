package com.example.kuljindersingh.fitnessworld.com.example.kuljindersingh.fitnessworld.dietdata;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.example.kuljindersingh.fitnessworld.R;


public class dietdatafront extends Activity

{
    GridView grid;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diet);
        int position=getIntent().getIntExtra("position",0);
        grid=(GridView)findViewById(R.id.grid);
        String type=getIntent().getStringExtra("type");
        new Post_diet(dietdatafront.this,grid,position).execute(type);
    }
}
