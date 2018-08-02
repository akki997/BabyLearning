package com.example.clearning;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;

public class j extends Fragment implements OnClickListener{
	View i;
	MediaPlayer mp;
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	// TODO Auto-generated method stub
View v=inflater.inflate(R.layout.fragment_j, container,false);
i=v.findViewById(R.id.imageView2);
mp=new MediaPlayer();
i.setOnClickListener(this);
return v;
}
	@Override
	public void onClick(View v) {
		try {
			if(mp.isPlaying()==true){
				mp.pause();
				mp.release();
			mp=MediaPlayer.create(getActivity(), R.raw.j_jug);
			mp.start();
					} else{mp=MediaPlayer.create(getActivity(), R.raw.j_jug);
					mp.start();}}
						catch (Exception e){}
		
	}
	}
