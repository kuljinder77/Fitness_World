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

import com.example.kuljindersingh.fitnessworld.gymdata.gymdatafront;
import com.example.kuljindersingh.fitnessworld.motivation.motivation;

/**
 * Created by Dr.h3cker on 14/03/2015.
 */
public class gymtab extends Fragment implements View.OnClickListener {

        ViewFlipper flipper;
    TextView text1,text2,text3;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.gymtab,container,false);
       flipper = (ViewFlipper)view.findViewById(R.id.gymflipper);
        text1=(TextView)view.findViewById(R.id.gymtext1);
        text2=(TextView)view.findViewById(R.id.gymtext2);
        text2.setOnClickListener(this);
        text1.setOnClickListener(this);
        flipper.startFlipping();

        return  view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.gymtext1:
            {

                   Intent a=new Intent(getContext(),gymdatafront.class);
                   startActivity(a);
                break;
            }

            case R.id.gymtext2:
            {

                Intent a=new Intent(getContext(),motivation.class);
                a.putExtra("position",1);
                startActivity(a);
                break;

            }
        }

    }
}
