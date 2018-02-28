package com.example.kuljindersingh.fitnessworld.yogadata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.kuljindersingh.fitnessworld.R;




public class yogafornext extends Activity

{
    ImageView image;
    GridView grid;
    String array[]={"Back_Pain","Weight_Loss","Hair_Growth","Height_Increase","Flat_Stomach"};


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yogaforfront);
        image=(ImageView)findViewById(R.id.yogaimage1);
        grid=(GridView)findViewById(R.id.grid12);
        int position=getIntent().getIntExtra("position",0);
        new Post_yogafornext(yogafornext.this,grid).execute(array[position]);

    }
}
