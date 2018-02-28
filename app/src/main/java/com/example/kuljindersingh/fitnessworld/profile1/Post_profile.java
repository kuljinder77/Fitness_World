package com.example.kuljindersingh.fitnessworld.profile1;

import android.app.Dialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kuljindersingh.fitnessworld.R;
import com.example.kuljindersingh.fitnessworld.storedatabase.Model_Getter_Setter_store;

import com.example.kuljindersingh.fitnessworld.storedatabase.storedataadapter;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;


public class Post_profile extends AsyncTask<String,String,String> {
    StringBuilder response;
    com.example.kuljindersingh.fitnessworld.profile1.Post obj;
    Context c;

    Model_Getter_Setter_profile model;
    ArrayList<Model_Getter_Setter_profile> model_arr = new ArrayList<Model_Getter_Setter_profile>();


    public Post_profile(Context c)
    {
        this.c = c;

    }
    @Override
    protected String doInBackground(String... params)
    {


        String url = "http://192.168.43.147/sqltry/profile.php?act=Selection&Request_type="+params[0];
        obj = new com.example.kuljindersingh.fitnessworld.profile1.Post(url);
        response =  obj.Connect();
        try {
            Log.e(",,,,,,,,,,,,,,,,,",""+url);

            JSONObject jsonObject = new JSONObject(String.valueOf(response));
            JSONArray jsonArray = jsonObject.getJSONArray("data");
            for (int i = 0; i < jsonArray.length(); i++)
            {

                JSONObject jsonObject1 = jsonArray.getJSONObject(i);

                String name = jsonObject1.getString("Name");
                String age = jsonObject1.getString("Age");
                String phone = jsonObject1.getString("Phone");
                String bmi = jsonObject1.getString("Bmi");
                String sex = jsonObject1.getString("Sex");
                String username = jsonObject1.getString("Username");


                model = new Model_Getter_Setter_profile(name,age,sex,bmi,phone,username);

                model_arr.add(model);
                Log.e(",,,,,,,,,,,,,,,,,",""+response);
            }
        }catch (Exception e)
        {

        }
        return null;
    }


}
