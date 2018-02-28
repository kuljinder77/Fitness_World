package com.example.kuljindersingh.fitnessworld.motivation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.kuljindersingh.fitnessworld.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class motivation extends Activity{
    Model_Getter_Setter_motivation obj;
    ArrayList<Model_Getter_Setter_motivation> model;
    int pos = 0;
    ImageView image;
    ViewFlipper flipper;

    ArrayList get(ArrayList<Model_Getter_Setter_motivation> model1) {
        model = model1;
        return model1;

    }

    String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        image = (ImageView) findViewById(R.id.motivationimage);

        int position = getIntent().getIntExtra("position", 0);
        if (position == 0) {
            type = "yoga";
            setContentView(R.layout.motivation2);

        } else if (position == 1) {
            type = "gym";
            setContentView(R.layout.motivation1);

        } else if (position == 2) {
            setContentView(R.layout.motivation3);
            type = "cardio";

        }
        flipper=(ViewFlipper)findViewById(R.id.flipper);
        flipper.startFlipping();



    /*    new Post_motivation(motivation.this).execute(type);
        ImageView image=(ImageView)findViewById(R.id.motivationimage);
        Button button1,button2;
        button1=(Button) findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        Picasso.with(this).load(model.get(pos).getImage()).into(image);

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.button:
            {
                if(pos>0)
                {
                    pos--;
                }
                else if(pos==0)
                {
                    pos=model.size()-1;
                }

                Picasso.with(this).load(model.get(pos).getImage()).into(image);


                break;
            }
            case R.id.button2:
            {
                if(pos<model.size()-1)
                {
                    pos++;
                }
                else if(pos==model.size()-1)
                {
                    pos=0;
                }
                Picasso.with(this).load(model.get(pos).getImage()).into(image);

                break;
            }
        }

    }*/
    }
}