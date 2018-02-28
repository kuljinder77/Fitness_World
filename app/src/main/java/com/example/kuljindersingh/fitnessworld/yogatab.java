package com.example.kuljindersingh.fitnessworld;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewFlipper;

//import com.example.kuljindersingh.fitnessworld.motivation.motivation;
import com.example.kuljindersingh.fitnessworld.motivation.motivation;
import com.example.kuljindersingh.fitnessworld.yogadata.yogadatafront;
import com.example.kuljindersingh.fitnessworld.yogadata.yogaforfront;

/**
 * Created by Dr.h3cker on 14/03/2015.
 */
public class yogatab extends Fragment implements View.OnClickListener {


    ViewFlipper flipper;

    TextView text1,text2,text3;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.yogatab,container,false);

        flipper = (ViewFlipper)view.findViewById(R.id.yogaflipper);
        text1=(TextView)view.findViewById(R.id.yogatypes);
        text2=(TextView)view.findViewById(R.id.yogafor);
        text3=(TextView)view.findViewById(R.id.yogamotivation);


        text1.setOnClickListener(this);
        text2.setOnClickListener(this);
        text3.setOnClickListener(this);

        flipper.startFlipping();


        return  view;
    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.yogatypes:
            {
                Intent a=new Intent(getContext(),yogadatafront.class);
                startActivity(a);
                break;

            }
            case R.id.yogafor:
            {

                Intent b=new Intent(getContext(),yogaforfront.class);
                startActivity(b);
                break;
            }
            case R.id.yogamotivation:
            {
                Intent a=new Intent(getContext(),motivation.class);
                a.putExtra("position",0);
                startActivity(a);
                break;

            }
        }

    }
}
