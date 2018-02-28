package com.example.kuljindersingh.fitnessworld.com.example.kuljindersingh.fitnessworld.dietdata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kuljindersingh.fitnessworld.R;

import java.util.ArrayList;

public class dietdataadapter extends BaseAdapter
{
    Context c;
    ArrayList<Model_Getter_Setter_diet> model_arr;
    LayoutInflater linf;
    public dietdataadapter(Context c, ArrayList<Model_Getter_Setter_diet> model_arr)
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
        convertView=linf.inflate(R.layout.customdatadiet,null);

        v.t1=(TextView)convertView.findViewById(R.id.mealname9);
        v.t2=(TextView)convertView.findViewById(R.id.meal9);

        v.t1.setText(model_arr.get(position).getName());
        v.t2.setText(model_arr.get(position).getDetail());


        return convertView;

    }
}

class View1
{
    TextView t1,t2,t3;
    ImageView img;
}