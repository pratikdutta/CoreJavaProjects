package com.mypack.flyweightpattern;

class BMWS6 extends BMWCars{

	@Override
	public Car createCarObject(String colour) {
		return this;
	}

	@Override
	public String name() {
		return "BMWS6";
	}

	@Override
	public Double price() {
		return 9595d;
	}

	@Override
	public String toString() {
		return "BMWS6 [name()=" + name() + ", price()=" + price()
				+ ", madeIn()=" + madeIn() + ", getRegnNo()=" + getRegnNo()+"]";
	}
	
	
	
}
