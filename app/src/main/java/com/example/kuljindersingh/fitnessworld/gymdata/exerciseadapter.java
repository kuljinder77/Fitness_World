package com.example.kuljindersingh.fitnessworld.gymdata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kuljindersingh.fitnessworld.R;

import java.util.ArrayList;


public class exerciseadapter extends BaseAdapter
{
    Context c;
    ArrayList<Model_Getter_Setter_gym> model_arr;
    LayoutInflater linf;
    public exerciseadapter(Context c, ArrayList<Model_Getter_Setter_gym> model_arr)
    {
        this.c = c;
        this.model_arr = model_arr;
        linf = LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        return model_arr.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View1 v=new View1();
        convertView=linf.inflate(R.layout.exercisecustom,null);

        v.t1=(TextView)convertView.findViewById(R.id.type);
        v.img=(ImageView)convertView.findViewById(R.id.muscle);

        if(model_arr.get(position).getType().equals("Chest"))
        {
            v.img.setBackgroundResource(R.drawable.chest);

        }
        else if(model_arr.get(position).getType().equals("Biceps"))
        {
            v.img.setBackgroundResource(R.drawable.biceps);

        }
        else if(model_arr.get(position).getType().equals("Triceps"))
        {
            v.img.setBackgroundResource(R.drawable.triceps);

        }
        else if(model_arr.get(position).getType().equals("Shoulders"))
        {
            v.img.setBackgroundResource(R.drawable.shoulders);

        }
        else if(model_arr.get(position).getType().equals("Back"))
        {
            v.img.setBackgroundResource(R.drawable.back);

        }
        else if(model_arr.get(position).getType().equals("Legs"))
        {
            v.img.setBackgroundResource(R.drawable.legs);

        }



        v.t1.setTextSize(15);
        v.t1.setText(model_arr.get(position).getName());


        return convertView;

    }
}


