package com.mypack.flyweightpattern;

public abstract class MarutiCars implements Car{
	
	public abstract String name();
	public abstract Double price();
	
	public final String madeIn(){
		return "India";
	}

}
