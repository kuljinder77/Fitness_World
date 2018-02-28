package com.example.kuljindersingh.fitnessworld.feedback;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;


import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;


public class Post_feedback extends AsyncTask<String,String,String> {
    StringBuilder response;
    com.example.kuljindersingh.fitnessworld.feedback.Post obj;
    Context c;



    public Post_feedback(Context c)
    {
        this.c = c;

    }
    @Override
    protected String doInBackground(String... params)
    {


        String url = "http://192.168.43.147/sqltry/motivation.php?act=Selection&Request_type="+params[0];
        obj = new Post(url);
        response =  obj.Connect();
        try {
            Log.e(",,,,,,,,,,,,,,,,,",""+url);

            JSONObject jsonObject = new JSONObject(String.valueOf(response));
            JSONArray jsonArray = jsonObject.getJSONArray("data");
            for (int i = 0; i < jsonArray.length(); i++)
            {

                JSONObject jsonObject1 = jsonArray.getJSONObject(i);

                String image = jsonObject1.getString("Image");



                Log.e(",,,,,,,,,,,,,,,,,",""+response);
            }
        }catch (Exception e)
        {

        }
        return null;
    }


}
