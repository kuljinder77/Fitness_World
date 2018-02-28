package com.example.kuljindersingh.fitnessworld;



        import java.text.DecimalFormat;

        import android.app.Dialog;
        import android.os.Bundle;
        import android.app.Activity;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.view.Menu;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.view.WindowManager;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.GridView;
        import android.widget.ImageView;
        import android.widget.TextView;

        import com.example.kuljindersingh.fitnessworld.storedatabase.supwebview;
        import com.squareup.picasso.Picasso;

public class bmi extends Activity implements OnClickListener {
    Button calculate;
    EditText weight, heightfeet,heightinches;
    String weight1, height1,height3;
    float weight2,height2;
    TextView bmiview, bmistatus;
    float height;
    GridView grid;

    double bmi;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
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
    public void onClick(View arg0)
    {
        switch (arg0.getId())
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
                bmiview.setText("Your BMI is : "+bmi);

                if(bmi<18.5)
                {
                    bmistatus.setText("Underweight");
                }
                else if(bmi<25 && bmi>=18.5)
                {
                    bmistatus.setText("Oh Great! its Normal");
                }
                else if(bmi>=25)
                {
                    bmistatus.setText("Overweight");
                }
                dialog_show();



                break;
            }

            default:
                break;
        }
    }
    public  void dialog_show()
    {
        final Dialog dialog = new Dialog(this);

        dialog.setContentView(R.layout.bmistatus);
        dialog.setTitle("Body Mass Index Status");
        //dialog.getActionBar().hide();
        WindowManager.LayoutParams parms=dialog.getWindow().getAttributes();

        parms.height=1500;
        parms.width=1000;


        dialog.getWindow().setAttributes(parms);
        TextView close = (TextView) dialog.findViewById(R.id.close);
        TextView text1 = (TextView) dialog.findViewById(R.id.text1);
        TextView text2 = (TextView) dialog.findViewById(R.id.text2);
        TextView text3 = (TextView) dialog.findViewById(R.id.text3);

        if(bmi<18.5)
        {
            text2.setText("Underweight");
            text1.setText("Your Bmi is :"+bmi);
            text3.setText("Do some light weight execise and take healty diet");
        }
        else if(bmi<25 && bmi>=18.5)
        {
            text2.setText("Normal");
            text1.setText("Your Bmi is :"+bmi);
            text3.setText("Its Great! keep it up");
        }
        else if(bmi>=25)
        {
            text2.setText("Overweight");
            text1.setText("Your Bmi is :"+bmi);
            text3.setText("You must go for cardio session");
        }


        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();

    }


}
