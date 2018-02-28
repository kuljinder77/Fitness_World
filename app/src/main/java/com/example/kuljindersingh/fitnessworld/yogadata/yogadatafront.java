package com.example.kuljindersingh.fitnessworld.yogadata;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.kuljindersingh.fitnessworld.R;

public class yogadatafront extends Activity

{
    ImageView image;
    GridView grid;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yogatypesfront);
        image=(ImageView)findViewById(R.id.yogaimage);
        grid=(GridView)findViewById(R.id.grid);
        new Post_yoga(yogadatafront.this,grid).execute();

    }
}
