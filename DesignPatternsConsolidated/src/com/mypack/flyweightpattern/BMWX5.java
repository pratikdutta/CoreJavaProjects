package com.mypack.flyweightpattern;

public class BMWX5 extends BMWCars{

	@Override
	public String name() {
		return "BMWX5";
	}

	@Override
	public Double price() {
		return 9999d;
	}

	@Override
	public Car createCarObject(String colour) {
		return this;
	}

	@Override
	public String toString() {
		return "BMWX5 [name()=" + name() + ", price()=" + price()
				+ ", madeIn()=" + madeIn() + ", getRegnNo()=" + getRegnNo()+ "]";
	}
	
	
}
