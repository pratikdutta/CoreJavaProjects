package com.mypack.abstractfactorypattern;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("INSIDE RECTANGLE DRAW");
	}
}
