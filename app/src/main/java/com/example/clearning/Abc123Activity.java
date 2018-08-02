package com.example.clearning;

import com.example.clearning.ABCActivity.abc;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

public class Abc123Activity extends FragmentActivity {
	ViewPager page;
	MediaPlayer mp;
	PagerAdapter pageradapter;
	static final int pagesnumber=11;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.count123);
		page=(ViewPager)findViewById(R.id.page123);
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
				m=new a1();
				
				break;

				
			case 1:
				m=new a2();
				try {
					if(mp.isPlaying()==true){
					   mp.pause();
					   mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.one);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.one);
							mp.start();}}
								catch (Exception e){}
			break;
			case 2:
				m=new a3();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.two);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.two);
							mp.start();}}
								catch (Exception e){}
				
			break;
				
			case 3:
				m=new a4();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.three);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.three);
							mp.start();}}
								catch (Exception e) {}
				
				break;
			case 4:
				m=new a5();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.four);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.four);
							mp.start();}}
								catch (Exception e) {}
				break;
			case 5:
				m=new a6();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.five);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.five);
							mp.start();}}
								catch (Exception e) {}
				break;
			case 6:
				m=new a7();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.six);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.six);
							mp.start();}}
								catch (Exception e) {}
				break;
			case 7:
				m=new a8();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.seven);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.seven);
							mp.start();}}
								catch (Exception e) {}
				break;
			case 8:
				m=new a9();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.eight);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.eight);
							mp.start();}}
								catch (Exception e) {}
				break;
			case 9:
				m=new a10();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.nine);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.nine);
							mp.start();}}
								catch (Exception e) {}
				break;
			case 10:
				m=new finish1();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.ten);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.ten);
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
