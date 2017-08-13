package com.mypack.flyweightpattern;

public class CarPoolDemo {

	private static String[] regnNos = { "2284", "1296", "6975", "7783", "2345" };

	public static void main(String[] args) {
		for (int i = 0; i < 20; ++i) {
			String regnNo = getRandomregnNo();
			Car car = (Car) CarPool.getPool().getCar(regnNo);
			System.out.println("Regn No#: "+regnNo+" --->  "+car);
		}
	}
	
	private static String getRandomregnNo(){
		return regnNos[(int)(Math.random()*regnNos.length)];
	}
}
