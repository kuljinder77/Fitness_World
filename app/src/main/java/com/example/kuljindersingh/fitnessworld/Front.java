package com.example.kuljindersingh.fitnessworld;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.kuljindersingh.fitnessworld.feedback.feedback;
import com.squareup.picasso.Picasso;


public class Front extends Activity
{
    GridView grid;
    Context c;



    int[] array={R.drawable.yoga,R.drawable.gym,R.drawable.cardio,R.drawable.bmi,R.drawable.store,R.drawable.diet};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(new adapter(this, array));

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
               if(position==0)//yoga
                {
                    Intent a=new Intent(Front.this,gym_yoga_cardio.class);
                    a.putExtra("position",0);
                    startActivity(a);

                }
                else if(position==1)//gym
                {
                    Intent a=new Intent(Front.this,gym_yoga_cardio.class);
                    a.putExtra("position",1);
                    startActivity(a);

                }

                else if(position==2)//cardio
                {
                    Intent a=new Intent(Front.this,gym_yoga_cardio.class);
                    a.putExtra("position",2);
                    startActivity(a);

                }

                else if(position==3)//bmi
                {
                    Intent a=new Intent(Front.this,bmi.class);
                    startActivity(a);
                }

                else if(position==4)//store
                {
                    Intent a=new Intent(Front.this,store.class);
                    startActivity(a);
                }

               else if(position==5)//diet plans
                {
                    Intent a=new Intent(Front.this,diet.class);
                   startActivity(a);
                }

            }
        });
    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_front, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.profile)
        {
            Intent a=new Intent(Front.this, com.example.kuljindersingh.fitnessworld.profile1.profile.class);
            startActivity(a);
            return true;
        }
        if (id == R.id.feedback) {
            Intent a=new Intent(Front.this,feedback.class);
            startActivity(a);

            return true;
        }
        if (id == R.id.aboutus) {
            dialogaboutus();

            return true;
        }
        if (id == R.id.logout) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public  void dialogaboutus()
    {
        final Dialog dialog = new Dialog(this);

        dialog.setContentView(R.layout.aboutus);
        dialog.getActionBar().hide();

        TextView close = (TextView) dialog.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();

    }*/
}