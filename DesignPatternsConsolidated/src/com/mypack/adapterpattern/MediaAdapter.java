package com.mypack.adapterpattern;

public class MediaAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer advancedPalyer;
	public MediaAdapter(String audioType) {
		if(audioType!= null && audioType.equalsIgnoreCase("vlc")){
			advancedPalyer = new VLCPlayer();
		}else if(audioType!= null && audioType.equalsIgnoreCase("mp4")){
			advancedPalyer = new MP4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		
		if(audioType.equalsIgnoreCase("vlc")){
			advancedPalyer.playVLC(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedPalyer.playMP4(fileName);
		}
	}
}
