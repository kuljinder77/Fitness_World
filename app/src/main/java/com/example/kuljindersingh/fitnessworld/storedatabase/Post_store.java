package com.example.kuljindersingh.fitnessworld.storedatabase;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kuljindersingh.fitnessworld.R;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;


public class Post_store extends AsyncTask<String,String,String> {
    StringBuilder response;
    Post obj;
    Context c;
    GridView lst;
    Model_Getter_Setter_store model;
    ArrayList<Model_Getter_Setter_store> model_arr = new ArrayList<Model_Getter_Setter_store>();


    public Post_store(Context c, GridView lst)
    {
        this.c = c;
        this.lst = lst;
    }
    @Override
    protected String doInBackground(String... params)
    {


        String url = "https://kuljinder77.000webhostapp.com/supplementselect.php?act=Selection&Request_type="+params[0];
        obj = new Post(url);
        response =  obj.Connect();
        try {
            Log.e(",,,,,,,,,,,,,,,,,",""+url);

            JSONObject jsonObject = new JSONObject(String.valueOf(response));
            JSONArray jsonArray = jsonObject.getJSONArray("data");
            for (int i = 0; i < jsonArray.length(); i++)
            {

                JSONObject jsonObject1 = jsonArray.getJSONObject(i);

                String name = jsonObject1.getString("Name");

                String type = jsonObject1.getString("Type");

                String price = jsonObject1.getString("Price");
                String weight = jsonObject1.getString("Weight");
                String link = jsonObject1.getString("Link");
                String detail = jsonObject1.getString("Detail");
                String image = jsonObject1.getString("Image");


                model = new Model_Getter_Setter_store(name,type,price,weight,detail,link,image);

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

        //Toast.makeText(c,""+response,Toast.LENGTH_LONG).show();
        lst.setAdapter(new storedataadapter(c,model_arr));
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dialog_show(position);

            }
        });
    }

    public  void dialog_show(int pos)
    {
        final Dialog dialog = new Dialog(c);

        dialog.setContentView(R.layout.supplementbuy);
        dialog.setTitle("Buy Supplements");
        //dialog.getActionBar().hide();
        WindowManager.LayoutParams parms=dialog.getWindow().getAttributes();

        parms.height=1500;
        parms.width=1000;


        dialog.getWindow().setAttributes(parms);
        TextView suptype,supprice,supweight,supdetail,supname = (TextView) dialog.findViewById(R.id.supname);
        ImageView supimage=(ImageView)dialog.findViewById(R.id.supimage);

        supprice = (TextView) dialog.findViewById(R.id.supprice);
        suptype = (TextView) dialog.findViewById(R.id.suptype);
        supweight = (TextView) dialog.findViewById(R.id.supweight);
        supdetail = (TextView) dialog.findViewById(R.id.supdetail);

        final String link=model_arr.get(pos).getLink();
        supname.setText(model_arr.get(pos).getName());
        supprice.setText(model_arr.get(pos).getPrice());
        supdetail.setText(model_arr.get(pos).getDetail());
        supweight.setText(model_arr.get(pos).getWeight());
        suptype.setText(model_arr.get(pos).getType());
        Picasso.with(c).load(model_arr.get(pos).getImage()).into(supimage);

        Button buy = (Button)dialog.findViewById(R.id.buy);
        TextView close = (TextView) dialog.findViewById(R.id.close);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent a=new Intent(c,supwebview.class);
                a.putExtra("url",link);
                c.startActivity(a);

            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();

    }
}
