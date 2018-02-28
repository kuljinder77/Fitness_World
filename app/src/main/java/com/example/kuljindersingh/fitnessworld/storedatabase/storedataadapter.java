package com.example.kuljindersingh.fitnessworld.storedatabase;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kuljindersingh.fitnessworld.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;



public class storedataadapter extends BaseAdapter
{
    Context c;
    ArrayList<Model_Getter_Setter_store> model_arr;
    LayoutInflater linf;
    public storedataadapter(Context c, ArrayList<Model_Getter_Setter_store> model_arr)
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
        convertView=linf.inflate(R.layout.customdatastore,null);

        v.t1=(TextView)convertView.findViewById(R.id.custtext);
        v.t2=(TextView)convertView.findViewById(R.id.custtext2);
        //  v.t3=(TextView)convertView.findViewById(R.id.textView3);
        v.img=(ImageView)convertView.findViewById(R.id.custimage);


        v.t1.setText(model_arr.get(position).getName());


        v.t2.setText(model_arr.get(position).getType());
        //  v.t3.setText(model_arr.get(position).getHowto());
        Picasso.with(c).load(model_arr.get(position).getImage()).into(v.img);
        return convertView;

    }
}

class View1
{
    TextView t1,t2,t3;
    ImageView img;
}