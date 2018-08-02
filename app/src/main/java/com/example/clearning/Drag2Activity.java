package com.example.clearning;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class Drag2Activity extends Activity implements OnClickListener {
	ImageView a,b,c,d,e,f,g,h;
	int e1,f1,g1,h1;
	MediaPlayer mp;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_drag2);
		a=(ImageView)findViewById(R.id.imageView1);
		a.setOnClickListener(this);
		b=(ImageView)findViewById(R.id.imageView2);
		b.setOnClickListener(this);
        c=(ImageView)findViewById(R.id.imageView3);
        c.setOnClickListener(this);
        d=(ImageView)findViewById(R.id.imageView4);
        d.setOnClickListener(this);
        e=(ImageView)findViewById(R.id.imageView5);
        e.setOnClickListener(this);
        f=(ImageView)findViewById(R.id.imageView6);
        f.setOnClickListener(this);
        g=(ImageView)findViewById(R.id.imageView7);
        g.setOnClickListener(this);
        h=(ImageView)findViewById(R.id.imageView8);
        h.setOnClickListener(this);
        e1=Integer.parseInt((e.getTag().toString()));
        f1=Integer.parseInt((f.getTag().toString()));
        g1=Integer.parseInt((g.getTag().toString()));
        h1=Integer.parseInt((h.getTag().toString()));
		mp=new MediaPlayer();
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==f){
			Toast.makeText(getApplicationContext(), "Correct Match", Toast.LENGTH_SHORT).show();
			b.setVisibility(View.VISIBLE);
			f.setVisibility(View.INVISIBLE);
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(this, R.raw.ship);
				mp.start();
			}else{
				mp=MediaPlayer.create(this, R.raw.ship);
				mp.start();
			}
				} catch (Exception e) {
				// TODO: handle exception
			}
			Thread t=new Thread(){
				public  void run() {
					try {
						sleep(1000);
						 Random rnd = new Random();
				            int x=rnd.nextInt(8)+1;

				            switch(x){
				            case 7:
				                Intent intent=new Intent(f.getContext(), Drag1Activity.class);
				                 startActivityForResult(intent, 0);
				            break;
				            case 6:
				                Intent intent2=new Intent(f.getContext(), Drag3Activity.class);
				                 startActivityForResult(intent2, 0);
				            break;
				            case 5:
				                Intent intent3=new Intent(f.getContext(), Drag4Activity.class);
				                 startActivityForResult(intent3, 0);
				            break;
				            case 4:
				                Intent intent4=new Intent(f.getContext(), Drag5Activity.class);
				                 startActivityForResult(intent4, 0);
				            break;
				            case 3:
				                Intent intent5=new Intent(f.getContext(), Drag6Activity.class);
				                 startActivityForResult(intent5, 0);
				            break;
				            case 2:
				                Intent intent6=new Intent(f.getContext(), Drag7Activity.class);
				                 startActivityForResult(intent6, 0);
				            break;
				            case 1:
				                Intent intent7=new Intent(f.getContext(), Drag8Activity.class);
				                 startActivityForResult(intent7, 0);
				            break;
				            }
						finish();
					} catch (Exception e) {	}

				}
			
			};t.start();
			}
		else if(v==e){
		Toast.makeText(getApplicationContext(), "Incorrect ", Toast.LENGTH_SHORT).show();
		}else if(v==g){
			Toast.makeText(getApplicationContext(), "Incorrect ", Toast.LENGTH_SHORT).show();
			}else if(v==h){
				Toast.makeText(getApplicationContext(), "Incorrect ", Toast.LENGTH_SHORT).show();
				}
	}
}