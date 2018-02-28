package com.example.kuljindersingh.fitnessworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;

import java.text.DecimalFormat;

/**
 * Created by kuljinder singh on 5/16/2016.
 */
public class bmisignup extends Activity implements View.OnClickListener
{
    Button calculate;
    EditText weight, heightfeet,heightinches;
    String weight1, height1,height3;
    float weight2, height2;
    TextView bmiview, bmistatus;
    float height;
    GridView grid;
    double bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);
        calculate = (Button) findViewById(R.id.calulate);
        calculate.setOnClickListener(this);
        weight = (EditText) findViewById(R.id.weight);
        bmiview = (TextView) findViewById(R.id.bmiview);
        heightfeet = (EditText) findViewById(R.id.heightfeet);
        heightinches = (EditText) findViewById(R.id.heightinches);
        bmistatus = (TextView) findViewById(R.id.bmistatus);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.calulate:
            {

                height1=heightfeet.getText().toString();
                height3=heightinches.getText().toString();
                height=(12*Float.parseFloat(height1))+Float.parseFloat(height3);
                height2=height;
                weight1=weight.getText().toString();
                weight2=Float.parseFloat(weight1);

                height2=height2 * 0.0254f;
                height2=height2 * height2;
                bmi=weight2/height2;
                //bmi=Math.round((bmi*100.0)/100.0);
                bmi=Double.parseDouble(new DecimalFormat("##.##").format(bmi));

                Intent a=new Intent(bmisignup.this,signup.class);
                a.putExtra("bmi",bmi);
                startActivity(a);



                break;
            }

            default:
                break;
        }
        }


    }

