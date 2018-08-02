package com.example.clearning;

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

public class FlyingActivity extends FragmentActivity {
PagerAdapter pageradapter;
ViewPager pager;
MediaPlayer mp;
static final int pagenumber=11;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_flying);
		pager=(ViewPager)findViewById(R.id.flyacti);
		pageradapter=new xyz(getSupportFragmentManager());
		pager.setAdapter(pageradapter);
		mp=new MediaPlayer();
	}
public class xyz extends FragmentStatePagerAdapter{
public xyz(FragmentManager fm){super (fm);}
	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		Fragment m=new Fragment();
		switch(arg0)
		{
			case 0:
			m=new f_eagle();
			
			break;

			
		case 1:
			m=new f_sparrow();
			try {
				if(mp.isPlaying()==true){
				   mp.pause();
				   mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.feagle);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.feagle);
						mp.start();}}
							catch (Exception e){}
		break;
		case 2:
			m=new f_duck();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.fsparrow);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.fsparrow);
						mp.start();}}
							catch (Exception e){}
			
		break;
			
		case 3:
			m=new f_kingfisher();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.fduck);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.fduck);
						mp.start();}}
							catch (Exception e) {}
			
			break;
		case 4:
			m=new f_pigeon();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.fkingfisher);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.fkingfisher);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 5:
			m=new f_peacock();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.fpigeon);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.fpigeon);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 6:
			m=new f_owl();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.fpeacock);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.fpeacock);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 7:
			m=new f_ostrich();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.fowl);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.fowl);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 8:
			m=new f_parrot();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.fostrich);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.fostrich);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 9:
			m=new f_crow();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.fparrot);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.fparrot);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 10:
			m=new finish1();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.fcrow);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.fcrow);
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
		return pagenumber;
	}
	
}
	
}
