package com.mypack.flyweightpattern;

public class MarituBaleno extends MarutiCars{

	@Override
	public Car createCarObject(String colour) {
		return this;
	}

	@Override
	public String name() {
		return "MarituBaleno";
	}

	@Override
	public Double price() {
		return 3456d;
	}

	@Override
	public String toString() {
		return "MarituBaleno [name()=" + name() + ", price()=" + price()
				+ ", madeIn()=" + madeIn() +"]";
	}
	
	
}
