package com.example.kuljindersingh.fitnessworld;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

//this project developped by iheb ben salem@IBSSoft
public class gym_yoga_cardio extends FragmentActivity {

    ViewPager pager;
    PagerTabStrip tab_strp;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gym_yoga_cardio);
        viewPageAdapter mapager=new viewPageAdapter(getSupportFragmentManager());
        pager=(ViewPager)findViewById(R.id.pager);
        position=getIntent().getIntExtra("position",0);
        pager.setAdapter(mapager);
        if(position==0)
        {
            pager.setCurrentItem(0);

        }
        else if(position==1)
        {
            pager.setCurrentItem(1);
        }
        else if(position==2)
        {
            pager.setCurrentItem(2);

        }

        tab_strp=(PagerTabStrip)findViewById(R.id.tab_strip);
        tab_strp.setTextColor(Color.WHITE);

          tab_strp.setTextSize(3,12);
         tab_strp.setTabIndicatorColor(Color.BLACK);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
 //       getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
     //   if (id == R.id.share) {
     //       return true;
     //   }

        return super.onOptionsItemSelected(item);
    }



}
