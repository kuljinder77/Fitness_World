package com.example.kuljindersingh.fitnessworld.motivation;

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
import com.example.kuljindersingh.fitnessworld.storedatabase.Post;
import com.example.kuljindersingh.fitnessworld.storedatabase.storedataadapter;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;


public class Post_motivation extends AsyncTask<String,String,String> {
    StringBuilder response;
    com.example.kuljindersingh.fitnessworld.motivation.Post obj;
    Context c;
  Model_Getter_Setter_motivation model;
    ArrayList<Model_Getter_Setter_motivation> model_arr = new ArrayList<Model_Getter_Setter_motivation>();

    public Post_motivation(Context c)
    {
        this.c = c;

    }
    @Override
    protected String doInBackground(String... params)
    {


        String url = "http://192.168.43.147/sqltry/motivation.php?act=Selection&Request_type="+params[0];
        obj = new com.example.kuljindersingh.fitnessworld.motivation.Post(url);
        response =  obj.Connect();
        try {
            Log.e(",,,,,,,,,,,,,,,,,",""+url);

            JSONObject jsonObject = new JSONObject(String.valueOf(response));
            JSONArray jsonArray = jsonObject.getJSONArray("data");
            for (int i = 0; i < jsonArray.length(); i++)
            {

                JSONObject jsonObject1 = jsonArray.getJSONObject(i);

                String image = jsonObject1.getString("Image");

                model = new Model_Getter_Setter_motivation(image);

                model_arr.add(model);
                motivation a=new motivation();

                a.get(model_arr);

            }
        }catch (Exception e)
        {

        }
        return null;
    }


}
