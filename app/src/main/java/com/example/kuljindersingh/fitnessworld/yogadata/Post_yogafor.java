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



public class Post_yogafor extends AsyncTask<String,String,String> {
    StringBuilder response;
    Post obj;
    Context c;
    GridView lst;
    Model_Getter_Setter_yogafor model;
    ArrayList<Model_Getter_Setter_yogafor> model_arr = new ArrayList<Model_Getter_Setter_yogafor>();


    public Post_yogafor(Context c, GridView lst)
    {
        this.c = c;
        this.lst = lst;
    }
    @Override
    protected String doInBackground(String... params)
    {


        String url = "https://kuljinder77.000webhostapp.com/yogaforselect.php?act=Selection";
        obj = new Post(url);
        response =  obj.Connect();
        try {


            JSONObject jsonObject = new JSONObject(String.valueOf(response));
            JSONArray jsonArray = jsonObject.getJSONArray("data");
            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject jsonObject1 = jsonArray.getJSONObject(i);

                String item = jsonObject1.getString("Item_check");
                
                model = new Model_Getter_Setter_yogafor(item);

                model_arr.add(model);
                Log.e(",,,,,,,,,,,,,,,,,", "" + response);
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
        lst.setAdapter(new yogafordataadapter(c, model_arr));

    }




}
