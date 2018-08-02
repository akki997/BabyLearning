package com.example.clearning;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Window;
import android.view.WindowManager;


public class AnimalActivity extends FragmentActivity {
	ViewPager page;
	MediaPlayer mp;
	PagerAdapter pageradapter;
	static final int pagesnumber=11;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_animal);
		page=(ViewPager)findViewById(R.id.pageanimal);
		pageradapter=new abc(getSupportFragmentManager());
		page.setAdapter(pageradapter);
		mp= new MediaPlayer();	
	}

	public class abc extends FragmentStatePagerAdapter{
		public abc(FragmentManager fm)
		{super (fm);}

		@Override
		public Fragment getItem(int arg0) {
			// TODO Auto-generated method stub
			Fragment m=new Fragment();
			switch(arg0)
			{
				case 0:
				m=new a_lion();
				
				break;

				
			case 1:
				m=new a_tiger();
				try {
					if(mp.isPlaying()==true){
					   mp.pause();
					   mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.lion);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.lion);
							mp.start();}}
								catch (Exception e){}
			break;
			case 2:
				m=new a_kangaroo();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.tiger);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.tiger);
							mp.start();}}
								catch (Exception e){}
				
			break;
				
			case 3:
				m=new a_leopard();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.kangaroo);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.kangaroo);
							mp.start();}}
								catch (Exception e) {}
				
				break;
			case 4:
				m=new a_bear();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.leopard);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.leopard);
							mp.start();}}
								catch (Exception e) {}
				break;
			case 5:
				m=new a_elephant();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.bear);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.bear);
							mp.start();}}
								catch (Exception e) {}
				break;
			case 6:
				m=new a_deer();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.elephant);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.elephant);
							mp.start();}}
								catch (Exception e) {}
				break;
			case 7:
				m=new a_fox();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.deer);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.deer);
							mp.start();}}
								catch (Exception e) {}
				break;
			case 8:
				m=new a_bison();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.fox);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.fox);
							mp.start();}}
								catch (Exception e) {}
				break;
			case 9:
				m=new a_zebra();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.bison);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.bison);
							mp.start();}}
								catch (Exception e) {}
				break;
			case 10:
				m=new finish1();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.zebra);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.zebra);
							mp.start();}}
								catch (Exception e) {}
				break;
			default:
				m=new finish1();
				break;
		}
		return m;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return pagesnumber;
	}
	
}
}
