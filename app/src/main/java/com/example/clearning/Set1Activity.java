package com.example.clearning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Set1Activity extends Activity implements OnClickListener {
ImageButton a,b,c,d;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		setContentView(R.layout.activity_set1);
		a=(ImageButton)findViewById(R.id.abcButton1);
		b=(ImageButton)findViewById(R.id.countButton2);
		c=(ImageButton)findViewById(R.id.animalsButton3);
		d=(ImageButton)findViewById(R.id.colorsButton4);
		a.setOnClickListener(this);
		b.setOnClickListener(this);
		c.setOnClickListener(this);
		d.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
	if(v==a){
		Intent i=new Intent(this,ABCActivity.class);
		startActivity(i);
	}else if(v==b){
		Intent i=new Intent(this,Abc123Activity.class);
		startActivity(i);
	}else if(v==c){
		Intent i=new Intent(this,FruitActivity.class);
		startActivity(i);
	}
	else{
		Intent i=new Intent(this,Set2Activity.class);
		startActivity(i);
		finish();
		
	}
		
	}
}
	