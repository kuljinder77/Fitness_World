package com.example.kuljindersingh.fitnessworld.gymdata;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.kuljindersingh.fitnessworld.R;

/**
 * Created by kuljinder singh on 5/20/2016.
 */
public class exercise extends Activity
{
    GridView grid;
    String array[]={"Chest","Biceps","Triceps","Shoulders","Back","Legs"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise);
        grid=(GridView)findViewById(R.id.grid);
        int position=getIntent().getIntExtra("position",0);
        new Post_exercise(exercise.this,grid).execute(array[position]);
    }
}
