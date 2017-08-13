package com.mypack.adapterpattern;

public class VLCPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		System.out.println("Playing VLC File: "+ fileName);
	}

	@Override
	public void playMP4(String fileName) {
		// Do Nothing
	}
}
