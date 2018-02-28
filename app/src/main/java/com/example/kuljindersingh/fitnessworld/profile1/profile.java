package com.example.kuljindersingh.fitnessworld.profile1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kuljindersingh.fitnessworld.Front;
import com.example.kuljindersingh.fitnessworld.R;

/**
 * Created by kuljinder singh on 5/19/2016.
 */
public class profile extends Activity implements View.OnClickListener
{
    TextView name,age,phone,sex,username,bmi,close;
    Model_Getter_Setter_profile model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.profile);
        name=(TextView)findViewById(R.id.name);
        age=(TextView)findViewById(R.id.age);
        phone=(TextView)findViewById(R.id.phone);
        sex=(TextView)findViewById(R.id.sex);
        bmi=(TextView)findViewById(R.id.bmi);
        username=(TextView)findViewById(R.id.username);
        close=(Button)findViewById(R.id.close);
        close.setOnClickListener(this);
        name.setText(model.getName());
        age.setText(model.getAge());
        sex.setText(model.getSex());
        bmi.setText(model.getBmi());
        phone.setText(model.getPhone());
        username.setText(model.getUsername());


    }

    @Override
    public void onClick(View v)
    {
        Intent a=new Intent(profile.this,Front.class);
        startActivity(a);

    }
}
