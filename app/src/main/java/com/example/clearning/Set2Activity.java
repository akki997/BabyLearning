package com.example.clearning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Set2Activity extends Activity implements OnClickListener {
ImageButton a,b,c,d;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_set2);
		a=(ImageButton)findViewById(R.id.animalButton1);
		b=(ImageButton)findViewById(R.id.birdsButton2);
		c=(ImageButton)findViewById(R.id.vegetablesButton3);
		d=(ImageButton)findViewById(R.id.previous1);
		a.setOnClickListener(this);
		b.setOnClickListener(this);
		c.setOnClickListener(this);
		d.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
	if(v==a){
		Intent i=new Intent(this,AnimalActivity.class);
		startActivity(i);
	}else if(v==b){
		Intent i=new Intent(this,FlyingActivity.class);
		startActivity(i);
	}else if(v==c){}
	else{
		Intent i=new Intent(this,Set1Activity.class);
		startActivity(i);
		finish();
		
	}
		
	}
}
	