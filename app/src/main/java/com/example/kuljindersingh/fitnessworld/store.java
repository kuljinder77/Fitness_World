package com.example.kuljindersingh.fitnessworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.kuljindersingh.fitnessworld.storedatabase.storedatafront;


public class store extends Activity
{
    ImageView image;
    GridView grid;
    String array[]={"Fat Burner","Lean Mass Gainer","Weight Gainer","Protein","Pre Workout","Vitamins"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store);
        image=(ImageView)findViewById(R.id.storeimage);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(new storeadapter(this,array));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent a=new Intent(store.this,storedatafront.class);
                a.putExtra("Key1",position);
                startActivity(a);


            }
        });
    }
  /*  public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_front, menu);
        return true;
    }*/
}
