package com.example.kuljindersingh.fitnessworld.yogadata;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kuljindersingh.fitnessworld.R;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;


public class Post_yoga extends AsyncTask<String,String,String> {
    StringBuilder response;
    Post obj;
    Context c;
    GridView lst;
    Model_Getter_Setter_yoga model;
    ArrayList<Model_Getter_Setter_yoga> model_arr = new ArrayList<Model_Getter_Setter_yoga>();


    public Post_yoga(Context c, GridView lst)
    {
        this.c = c;
        this.lst = lst;
    }
    @Override
    protected String doInBackground(String... params)
    {


        String url = "https://kuljinder77.000webhostapp.com/yogapostureselect.php?act=Selection";
        obj = new Post(url);
        response =  obj.Connect();
        Log.e(",,,,,efeererer,,,,,,",""+url);
        Log.e(",,,,,,,,,,,,,,,,,",""+response);
        try {

            Log.e(",,,,,,,,,try,,,,,",""+response);
            JSONObject jsonObject = new JSONObject(String.valueOf(response));
            JSONArray jsonArray = jsonObject.getJSONArray("data");
            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                String name = jsonObject1.getString("Name");
                String image = jsonObject1.getString("Image");
                String description = jsonObject1.getString("Description");

                String item = jsonObject1.getString("Item_check");

                model = new Model_Getter_Setter_yoga(name,description,image,item);

                model_arr.add(model);

            }
        }catch (Exception e)
        {

        }
        return null;
    }

    @Override
    protected void onPostExecute(String aVoid) {
        super.onPostExecute(aVoid);

        //Toast.makeText(c,""+response,Toast.LENGTH_LONG).show();
        lst.setAdapter(new yogadataadapter(c, model_arr));
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                dialog_show(position);


            }
        });
    }
    public  void dialog_show(int pos)
    {
        final Dialog dialog = new Dialog(c);

        dialog.setContentView(R.layout.exercisedetail);
        dialog.setTitle("Way to do");
        //dialog.getActionBar().hide();
        WindowManager.LayoutParams parms=dialog.getWindow().getAttributes();

        parms.height=1800;
        parms.width=1000;


        dialog.getWindow().setAttributes(parms);
        TextView type,exedetail,exename = (TextView) dialog.findViewById(R.id.exename);
        ImageView exerciseimage=(ImageView)dialog.findViewById(R.id.exerciseimage);


        exedetail = (TextView) dialog.findViewById(R.id.exedetail);
        type=(TextView)dialog.findViewById(R.id.exetype);
        exename.setText(model_arr.get(pos).getName());

        exedetail.setText(model_arr.get(pos).getDescription());

        type.setText(model_arr.get(pos).getItem());

        Picasso.with(c).load(model_arr.get(pos).getImage()).into(exerciseimage);


        TextView close = (TextView) dialog.findViewById(R.id.close);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();

    }



}
