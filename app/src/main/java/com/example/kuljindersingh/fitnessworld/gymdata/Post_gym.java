package com.example.kuljindersingh.fitnessworld.gymdata;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kuljindersingh.fitnessworld.R;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;


public class Post_gym extends AsyncTask<String,String,String> {
    StringBuilder response;
    Post obj;
    Context c;
    GridView lst;
    Model_Getter_Setter_gymexercise model1;
    String a;

    ArrayList<Model_Getter_Setter_gymexercise> model_arr1 = new ArrayList<Model_Getter_Setter_gymexercise>();


    public Post_gym(Context c, GridView lst) {
        this.c = c;
        this.lst = lst;
    }

    @Override
    protected String doInBackground(String... params) {


        String url = "https://kuljinder77.000webhostapp.com/exercisetypeselect.php?act=Selection";
        obj = new Post(url);
        response = obj.Connect();
        try {


            JSONObject jsonObject = new JSONObject(String.valueOf(response));
            JSONArray jsonArray = jsonObject.getJSONArray("data");
            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject jsonObject1 = jsonArray.getJSONObject(i);


                String type = jsonObject1.getString("Type");


                model1 = new Model_Getter_Setter_gymexercise(type);

                model_arr1.add(model1);
                Log.e(",,,,,,,,,,,,,,,,,", "" + response);
            }
        } catch (Exception e) {

        }


        return null;
    }

    @Override
    protected void onPostExecute(String aVoid) {
        super.onPostExecute(aVoid);

        lst.setAdapter(new gymdataadapter(c, model_arr1));
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent a = new Intent(c, exercise.class);
                a.putExtra("position", position);
                c.startActivity(a);


            }
        });

    }
}






