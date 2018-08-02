package com.example.clearning;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class EHardActivity extends Activity implements OnClickListener {
ImageView a,b,c;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_ehard);
		a=(ImageView)findViewById(R.id.easy);
		b=(ImageView)findViewById(R.id.hard);
		a.setOnClickListener(this);
		b.setOnClickListener(this);
		c=(ImageView)findViewById(R.id.med);
		c.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		if(v==a){
			Intent i=new Intent(this,Set1Activity.class);
			startActivity(i);
		}
		else if(v==c){
			Intent i=new Intent(this,MedActivity.class);
			startActivity(i);
		}else if(v==b){
			 Random rnd = new Random();
	            int x=rnd.nextInt(8)+1;

	            switch(x){
	            case 1:
	                Intent intent=new Intent(b.getContext(), Drag1Activity.class);
	                 startActivityForResult(intent, 0);
	            break;
	            case 2:
	                Intent intent1=new Intent(b.getContext(), Drag2Activity.class);
	                 startActivityForResult(intent1, 0);
	            break;
	            case 3:
	                Intent intent2=new Intent(b.getContext(), Drag3Activity.class);
	                 startActivityForResult(intent2, 0);
	            break;
	            case 4:
	                Intent intent3=new Intent(b.getContext(), Drag4Activity.class);
	                 startActivityForResult(intent3, 0);
	            break;
	            case 5:
	                Intent intent4=new Intent(b.getContext(), Drag5Activity.class);
	                 startActivityForResult(intent4, 0);
	            break;
	            case 6:
	                Intent intent5=new Intent(b.getContext(), Drag6Activity.class);
	                 startActivityForResult(intent5, 0);
	            break;
	            case 7:
	                Intent intent6=new Intent(b.getContext(), Drag7Activity.class);
	                 startActivityForResult(intent6, 0);
	            break;
	            case 8:
	                Intent intent7=new Intent(b.getContext(), Drag8Activity.class);
	                 startActivityForResult(intent7, 0);
	            break;
		}
		
	}

	}
}
