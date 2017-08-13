package com.mypack.adapterpattern;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter adapter = null;
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing MP3 File:" +fileName);
		}else if(audioType.equalsIgnoreCase("vlc")
				|| audioType.equalsIgnoreCase("mp4")){
			adapter = new MediaAdapter(audioType);
			adapter.play(audioType, fileName);
		}else{
			System.out.println("Format Not Supported");
		}

	}

}
