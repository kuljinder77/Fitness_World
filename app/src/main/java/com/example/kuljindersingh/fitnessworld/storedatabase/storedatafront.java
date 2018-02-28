package com.example.kuljindersingh.fitnessworld.storedatabase;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.kuljindersingh.fitnessworld.R;

public class storedatafront extends Activity

{
    ImageView image;
    GridView grid;
    String array1[]={"Fat_Burner","Mass_Gainer","Weight_Gainer","Protein","Pre-Workout","Vitamins"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store1);
        image=(ImageView)findViewById(R.id.storeimage1);
        grid=(GridView)findViewById(R.id.grid1);
        int type=getIntent().getIntExtra("Key1",0);
        new Post_store(storedatafront.this,grid).execute(array1[type]);
    }
}
