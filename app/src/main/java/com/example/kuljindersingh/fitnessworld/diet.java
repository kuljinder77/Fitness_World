package com.example.kuljindersingh.fitnessworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.kuljindersingh.fitnessworld.com.example.kuljindersingh.fitnessworld.dietdata.dietdatafront;


public class diet extends Activity
{
    ImageView image;
    GridView grid;
    String array[]={"For Male Fitness","For Female Fitness","For Lean Mass Gaining","For Bodybuilding"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diet);
        image=(ImageView) findViewById(R.id.image);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(new dietadapter(this,array));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent a=new Intent(diet.this,dietdatafront.class);
                    a.putExtra("position",0);
                    a.putExtra("type","Fitness");
                    startActivity(a);

                } else if (position == 1) {
                    Intent a=new Intent(diet.this,dietdatafront.class);
                    a.putExtra("position",1);
                    a.putExtra("type","Fitness_F");
                    startActivity(a);

                } else if (position == 2) {
                    Intent a=new Intent(diet.this,dietdatafront.class);
                    a.putExtra("position",2);
                    a.putExtra("type","Veg_Lean_Mass");
                    startActivity(a);
                } else if (position == 3) {
                    Intent a=new Intent(diet.this,dietdatafront.class);
                    a.putExtra("position",3);
                    a.putExtra("type","Body_Building");
                    startActivity(a);
                }


            }
        });
    }
}
