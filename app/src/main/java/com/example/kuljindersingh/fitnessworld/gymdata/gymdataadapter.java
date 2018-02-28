package com.example.kuljindersingh.fitnessworld.gymdata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kuljindersingh.fitnessworld.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class gymdataadapter extends BaseAdapter
{
    Context c;
    ArrayList<Model_Getter_Setter_gymexercise> model_arr;
    LayoutInflater linf;
    int array[]={R.drawable.chest,R.drawable.biceps,R.drawable.triceps,R.drawable.shoulders,R.drawable.back,R.drawable.legs};
    public gymdataadapter(Context c, ArrayList<Model_Getter_Setter_gymexercise> model_arr)
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

        v.t1.setTextSize(15);
        v.t1.setText(model_arr.get(position).getType());

        v.img.setBackgroundResource(array[position]);
        return convertView;

    }
}

class View1
{
    TextView t1;
    ImageView img;
}