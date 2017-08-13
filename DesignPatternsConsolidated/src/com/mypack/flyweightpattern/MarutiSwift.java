package com.mypack.flyweightpattern;

public class MarutiSwift extends MarutiCars{

	@Override
	public Car createCarObject(String colour) {
		return this;
	}

	@Override
	public String name() {
		return "MarutiSwift";
	}

	@Override
	public Double price() {
		return 1234d;
	}

	@Override
	public String toString() {
		return "MarutiSwift [name()=" + name() + ", price()=" + price()
				+ ", madeIn()=" + madeIn() +"]";
	}
}
