package com.mypack.abstractfactorypattern;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
		
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOuR");
		
		Colour color1 = colorFactory.getColour("RED");
		color1.colour();
		
		Colour color2 = colorFactory.getColour("Blue");
		color2.colour();
	}
}
