package com.example.kuljindersingh.fitnessworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by kuljinder singh on 5/16/2016.
 */
public class login extends Activity implements View.OnClickListener
{
    Button login,signup;
    EditText username,password;
    String username1,password1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        login=(Button)findViewById(R.id.submit);

        signup=(Button)findViewById(R.id.signup);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())

        {
            case R.id.submit:
            {
                username1=username.getText().toString();
                password1=password.getText().toString();

                Intent a=new Intent(login.this,Front.class);
                startActivity(a);

                break;
            }
            case R.id.signup:
            {
                Intent a=new Intent(login.this,signup.class);
                startActivity(a);

                break;
            }

            
        }


    }
}
