package com.example.kuljindersingh.fitnessworld.yogadata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.kuljindersingh.fitnessworld.R;


public class yogaforfront extends Activity

{
    ImageView image;
    GridView grid12;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yogaforfront);
        image=(ImageView)findViewById(R.id.yogaimage1);
        grid12=(GridView)findViewById(R.id.grid12);
        new Post_yogafor(yogaforfront.this,grid12).execute();
        grid12.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent a = new Intent(yogaforfront.this, yogafornext.class);
                a.putExtra("position", position);
                startActivity(a);


            }
        });

    }
}
