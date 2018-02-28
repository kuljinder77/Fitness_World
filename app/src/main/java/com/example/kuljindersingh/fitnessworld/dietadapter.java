package com.example.kuljindersingh.fitnessworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

/**
 * Created by kuljinder singh on 4/27/2016.
 */
public class dietadapter extends BaseAdapter {
    Context mc;
    String[] array;
    LayoutInflater linf;
    public dietadapter(Context mc, String[] array) {
        this.array=array;
        this.mc=mc;
        this.linf=LayoutInflater.from(mc);
    }

    @Override
    public int getCount() {
        return array.length;
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

        convertView = linf.inflate(R.layout.customdiet,null);
        runtimea a=new runtimea();
        a.text=(TextView)convertView.findViewById(R.id.text);
        a.text.setText(array[position]);

        return convertView;


    }
}
class runtimea
{
    TextView text;
}

