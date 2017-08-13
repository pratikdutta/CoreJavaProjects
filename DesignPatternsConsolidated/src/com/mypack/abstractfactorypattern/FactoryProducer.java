package com.mypack.abstractfactorypattern;

public class FactoryProducer{
	
	public static AbstractFactory getFactory(String facType){
		if(facType!=null){
			if(facType.equalsIgnoreCase("Shape"))
				return new ShapeFactory();
			if(facType.equalsIgnoreCase("Colour"))
				return new ColourFactory();
		}
		return null;
	}
}
