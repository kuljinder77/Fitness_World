package com.example.kuljindersingh.fitnessworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.zip.Inflater;

public class storeadapter extends BaseAdapter
{
    Context mc;
    String[] array;
    LayoutInflater linf;
    public storeadapter(Context mc,String[] array)
    {
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
    public View getView(int position, View convertView, ViewGroup parent)
    {
        convertView = linf.inflate(R.layout.customstore,null);
        runtime a=new runtime();
        a.text=(TextView)convertView.findViewById(R.id.text);
        a.text.setText(array[position]);

        return convertView;
    }
}
class runtime
{
    TextView text;
}
