package com.mypack.flyweightpattern;

public abstract class BMWCars implements Car{
	
	private String regnNo;
	
	public abstract String name();
	public abstract Double price();
	
	public final String madeIn(){
		return "Germany";
	}
	public String getRegnNo() {
		return regnNo;
	}
	public void setRegnNo(String regnNo) {
		this.regnNo = regnNo;
	}

}