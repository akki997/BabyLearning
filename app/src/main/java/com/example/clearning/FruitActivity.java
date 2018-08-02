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


public class FruitActivity extends FragmentActivity {
	ViewPager page;
	MediaPlayer mp;
	PagerAdapter pageradapter;
	static final int pagesnumber=11;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_fruit);
		page=(ViewPager)findViewById(R.id.fruitacti);
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
				m=new w_apple();
				
				break;

				
			case 1:
				m=new w_grapes();
				try {
					if(mp.isPlaying()==true){
					   mp.pause();
					   mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.wapple);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.wapple);
							mp.start();}}
								catch (Exception e){}
			break;
			case 2:
				m=new w_mango();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.wgrapes);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.wgrapes);
							mp.start();}}
								catch (Exception e){}
				
			break;
				
			case 3:
				m=new w_banana();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.wmango);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.wmango);
							mp.start();}}
								catch (Exception e) {}
				
				break;
			case 4:
				m=new w_orange();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.wbanana);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.wbanana);
							mp.start();}}
								catch (Exception e) {}
				break;
			case 5:
				m=new w_kiwi();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.worange);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.worange);
							mp.start();}}
								catch (Exception e) {}
				break;
			case 6:
				m=new w_guava();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.wkiwi);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.wkiwi);
							mp.start();}}
								catch (Exception e) {}
				break;
			case 7:
				m=new w_litiches();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.wguava);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.wguava);
							mp.start();}}
								catch (Exception e) {}
				break;
			case 8:
				m=new w_cherry();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.wlitiches);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.wlitiches);
							mp.start();}}
								catch (Exception e) {}
				break;
			case 9:
				m=new w_papaya();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.wcherries);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.wcherries);
							mp.start();}}
								catch (Exception e) {}
				break;
			case 10:
				m=new finish1();
				try {
					if(mp.isPlaying()==true){
						mp.pause();
						mp.release();
					mp=MediaPlayer.create(getApplicationContext(), R.raw.wpapaya);
					mp.start();
							} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.wpapaya);
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
