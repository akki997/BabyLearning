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

public class ABCActivity extends FragmentActivity {
ViewPager page;
MediaPlayer mp;
PagerAdapter pageradapter;
static final int pagesnumber=27;
		protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_frag);
		page=(ViewPager)findViewById(R.id.page);
		pageradapter=new abc(getSupportFragmentManager());
		page.setAdapter(pageradapter);
		mp= new MediaPlayer();	
		
	}
		public void onBackPressed() {
		    if (getFragmentManager().getBackStackEntryCount() == 0) {
		        this.finish();
		    } else {
		        getFragmentManager().popBackStack();
		    }
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
			m=new a();
			
			break;

			
		case 1:
			m=new b();
			try {
				mp=MediaPlayer.create(getApplicationContext(), R.raw.a_apple);
				mp.start();
						} catch (Exception e) {
							mp=MediaPlayer.create(getApplicationContext(), R.raw.a_apple);
							mp.start();
				// TODO: handle exception
			}
		break;
			
		case 2:
			m=new c();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.b_ball);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.b_ball);
						mp.start();}}
							catch (Exception e){}
			
		break;
			
		case 3:
			m=new d();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.c_cat);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.c_cat);
						mp.start();}}
							catch (Exception e) {}
			
			break;
		case 4:
			m=new e();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.d_dog);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.d_dog);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 5:
			m=new f();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.e_elephant);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.e_elephant);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 6:
			m=new g();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.f_fish);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.f_fish);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 7:
			m=new h();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.g_grapes);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.g_grapes);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 8:
			m=new i();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.h_hen);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.h_hen);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 9:
			m=new j();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.i_inkpot);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.i_inkpot);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 10:
			m=new k();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.j_jug);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.j_jug);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 11:
			m=new l();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.k_kite);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.k_kite);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 12:
			m=new m();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.l_lion);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.l_lion);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 13:
			m=new n();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.m_monkey);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.m_monkey);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 14:
			m=new o();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.n_nest);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.n_nest);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 15:
			m=new p();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.o_owl);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.o_owl);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 16:
			m=new q();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.p_parrot);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.p_parrot);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 17:
			m=new rabbitr();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.q_queen);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.q_queen);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 18:
			m=new s();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.r_rabbit);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.r_rabbit);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 19:
			m=new t();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.s_ship);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.s_ship);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 20:
			m=new u();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.t_train);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.t_train);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 21:
			m=new v();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.u_umbrella);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.u_umbrella);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 22:
			m=new w();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.v_van);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.v_van);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 23:
			m=new x();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.w_watch);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.w_watch);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 24:
			m=new y();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.x_xmas);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.x_xmas);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 25:
			m=new z();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.y_yak);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.y_yak);
						mp.start();}}
							catch (Exception e) {}
			break;
		case 26:
			m=new finish1();
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getApplicationContext(), R.raw.z_zebra);
				mp.start();
						} else{mp=MediaPlayer.create(getApplicationContext(), R.raw.z_zebra);
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
