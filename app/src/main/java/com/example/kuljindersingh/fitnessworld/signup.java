package com.example.kuljindersingh.fitnessworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by kuljinder singh on 5/15/2016.
 */
public class signup extends Activity implements View.OnClickListener
{
    TextView bmitext;
    Button cancel,submit;
    RadioButton radiobutton;
    RadioGroup sex;
    EditText name,age,phone,email,bmi,username,password,confirmpassword;
    String name1,age1,phone1,email1,bmi1,username1,password1,confirmpassword1,sex1,calculationbmi;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        bmitext=(TextView)findViewById(R.id.bmitext);
        name=(EditText)findViewById(R.id.name);
        age=(EditText)findViewById(R.id.age);
        phone=(EditText)findViewById(R.id.phonenumber);
        email=(EditText)findViewById(R.id.email);
        bmi=(EditText)findViewById(R.id.bmiedittext);
        password=(EditText)findViewById(R.id.actualpassword);
        username=(EditText)findViewById(R.id.actualusername);
        confirmpassword=(EditText)findViewById(R.id.confirmpassword);
        sex=(RadioGroup)findViewById(R.id.sex);
        Intent in=getIntent();
        calculationbmi=in.getStringExtra("bmi");
        if(Integer.parseInt(calculationbmi)>0)
        {
            bmi.setText(calculationbmi);
        }
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.bmitext:
            {
               Intent a=new Intent(signup.this,bmisignup.class);
                startActivity(a);

                break;

            }
            case R.id.submit:
            {
                name1=name.getText().toString();
                age1=age.getText().toString();
                phone1=phone.getText().toString();
                bmi1=bmi.getText().toString();
                email1=email.getText().toString();
                username1=username.getText().toString();
                password1=password.getText().toString();
                confirmpassword1=confirmpassword.getText().toString();
                name1=name.getText().toString();
                int selectedId = sex.getCheckedRadioButtonId();
                radiobutton=(RadioButton)findViewById(selectedId);
                sex1=radiobutton.getText().toString();
                 break;

            }
            case R.id.cancel:
            {
                Intent a=new Intent(signup.this,login.class);
                startActivity(a);




                break;

            }
        }

    }
}
