package com.example.kuljindersingh.fitnessworld;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class adapter extends BaseAdapter

{
    int[] array;
    Context mc;
    LayoutInflater lin;
  //  String[] array2={"Yoga","Gym","Cardio","Bmi","Store","Diet Plans"};
    public adapter(Context mc,int array[])
    {
        this.array=array;
        this.mc=mc;
        this.lin=LayoutInflater.from(mc);

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
        convertView=lin.inflate(R.layout.abc,null);
        view a=new view();
        a.image=(ImageView)convertView.findViewById(R.id.image);
     //   a.text=(TextView)convertView.findViewById(R.id.fronttext);
        a.image.setBackgroundResource(array[position]);
     //   a.text.setText(array2[position]);
        return convertView;
    }
}
class view
{
    ImageView image;
  //  TextView text;
}