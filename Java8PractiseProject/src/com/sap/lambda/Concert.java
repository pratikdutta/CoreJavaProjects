package com.sap.lambda;

public class Concert {

	void start(SimplePlayable playable){
		playable.play();
	}
	
	boolean start(ReturningPlayable playable){
		return playable.play();
	}
	
	void start(CustomPlayable playable, int number){
		playable.play(number);
	}
}
