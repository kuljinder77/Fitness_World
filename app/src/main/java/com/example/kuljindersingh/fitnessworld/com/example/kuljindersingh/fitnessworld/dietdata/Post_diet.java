package com.example.kuljindersingh.fitnessworld.com.example.kuljindersingh.fitnessworld.dietdata;

import android.app.Dialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.kuljindersingh.fitnessworld.R;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;


public class Post_diet extends AsyncTask<String,String,String> {
    StringBuilder response;
    com.example.kuljindersingh.fitnessworld.com.example.kuljindersingh.fitnessworld.dietdata.Post obj;
    Context c;
    GridView lst;
    Model_Getter_Setter_diet model;
    int position;
    ArrayList<Model_Getter_Setter_diet> model_arr = new ArrayList<Model_Getter_Setter_diet>();


    public Post_diet(Context c, GridView lst,int position)
    {
        this.c = c;
        this.lst = lst;
        this.position=position;
    }
    @Override
    protected String doInBackground(String... params)
    {


        String url = "https://kuljinder77.000webhostapp.com/dietselect.php?act=Selection&Request_type="+params[0];
        obj = new Post(url);
        response =  obj.Connect();
        try {
            Log.e(",,,,,,,sdd,,,,,,,,,,",""+response);


            JSONObject jsonObject = new JSONObject(String.valueOf(response));
            JSONArray jsonArray = jsonObject.getJSONArray("data");
            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject jsonObject1 = jsonArray.getJSONObject(i);

                String name = jsonObject1.getString("Name");
                String detail = jsonObject1.getString("Details");
                String type = jsonObject1.getString("Type");

                model = new Model_Getter_Setter_diet(name,type,detail);

                model_arr.add(model);
                Log.e(",,,,,,,,,,,,,,,,,",""+response);
            }
        }catch (Exception e)
        {

        }
        return null;
    }

    @Override
    protected void onPostExecute(String aVoid) {
        super.onPostExecute(aVoid);
        lst.setAdapter(new dietdataadapter(c,model_arr));

    }

}
