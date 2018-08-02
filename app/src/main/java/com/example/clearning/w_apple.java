package com.example.clearning;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
public class w_apple extends Fragment implements OnClickListener {
	View i,j;
	MediaPlayer mp;
	@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	// TODO Auto-generated method stub
View v=inflater.inflate(R.layout.fruit_apple, container,false);
i=v.findViewById(R.id.imageView2);
j=v.findViewById(R.id.imageView1);
mp=new MediaPlayer();
i.setOnClickListener(this);
j.setOnClickListener(this);
return v;
}
	@Override
	public void onClick(View v) {
		if(v==i){
		try {
			if(mp.isPlaying()==true){
				mp.pause();
				mp.release();
			mp=MediaPlayer.create(getActivity(), R.raw.wapple);
			mp.start();
					} else{mp=MediaPlayer.create(getActivity(), R.raw.wapple);
					mp.start();}}
						catch (Exception e){}}
		else {
			try {
				if(mp.isPlaying()==true){
					mp.pause();
					mp.release();
				mp=MediaPlayer.create(getActivity(), R.raw.wapple);
				mp.start();
						} else{mp=MediaPlayer.create(getActivity(), R.raw.wapple);
						mp.start();}}
							catch (Exception e){}}
		}
		
	}
	
	
