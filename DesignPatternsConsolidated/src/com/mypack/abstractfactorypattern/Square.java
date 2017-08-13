package com.mypack.abstractfactorypattern;

public class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("INSIDE SQUARE DRAW");
	}
}
