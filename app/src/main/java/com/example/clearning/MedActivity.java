package com.example.clearning;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class MedActivity extends Activity implements OnClickListener {
	Button b1,b2;

    @Override
    public void onClick(View v) {
       switch (v.getId())
       {
           case R.id.checkBox1:
               if(sum==Integer.parseInt(t1.getText().toString())){
                   Toast.makeText(getApplicationContext(),"correct answer",Toast.LENGTH_SHORT).show();
               Intent t= new Intent(this,MedActivity.class);
               startActivity(t);
               finish();}
               else
                   Toast.makeText(getApplicationContext(),"wrong answer",Toast.LENGTH_SHORT).show();
               break;
           case R.id.checkBox2:
               if(sum==Integer.parseInt(t2.getText().toString())){

                   Toast.makeText(getApplicationContext(),"correct answer",Toast.LENGTH_SHORT).show();
               Intent t= new Intent(this,MedActivity.class);
               startActivity(t);
               finish();}
               else
                   Toast.makeText(getApplicationContext(),"wrong answer",Toast.LENGTH_SHORT).show();
               break;

               case R.id.checkBox3:
                   if(sum==Integer.parseInt(t3.getText().toString())){
                       Toast.makeText(getApplicationContext(),"correct answer",Toast.LENGTH_SHORT).show();
                       Intent t= new Intent(this,MedActivity.class);
                       startActivity(t);
                       finish();}
                    else
                       Toast.makeText(getApplicationContext(),"wrong answer",Toast.LENGTH_SHORT).show();

                   break;
       }
    }
TextView t1,t2,t3;
    CheckBox c1, c2, c3;
    int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med);
        t1=(TextView)findViewById(R.id.ans1);
        t2=(TextView)findViewById(R.id.ans2);
        t3=(TextView)findViewById(R.id.ans3);


        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b1.setText(String.valueOf(getRandomNumberInRange(1,4)));
        b2.setText(String.valueOf(getRandomNumberInRange(5,9)));
c1=(CheckBox)findViewById(R.id.checkBox1);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        c3=(CheckBox)findViewById(R.id.checkBox3);
        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);


        int result=(Integer.valueOf(b1.getText().toString())).intValue()+(Integer.valueOf(b2.getText().toString())).intValue();
         sum=result;
        String total=String.valueOf(sum);
        int check=getRandomNumberInRange(1,3);
        switch (check)
        {
            case 1:
                t1.setText(total);
                t2.setText(String.valueOf(getRandomNumberInRange(1,9)));
                t3.setText(String.valueOf(getRandomNumberInRange(1,9)));

                break;
            case 2:
                t2.setText(total);
                t1.setText(String.valueOf(getRandomNumberInRange(1,9)));
                t3.setText(String.valueOf(getRandomNumberInRange(1,9)));
                break;
            case 3:
                t3.setText(total);
                t2.setText(String.valueOf(getRandomNumberInRange(1,9)));
                t1.setText(String.valueOf(getRandomNumberInRange(1,9)));
                break;
        }
    }
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
