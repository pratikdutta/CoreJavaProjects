package com.mypack.abstractfactorypattern;

public class ShapeFactory extends AbstractFactory{
	
	@Override
	public Shape getShape(String shapeName){
		if(shapeName != null){
			if(shapeName.equalsIgnoreCase("Square"))
				return new Square();
			if(shapeName.equalsIgnoreCase("Rectangle"))
				return new Rectangle();
		}
		return null;
	}

	@Override
	Colour getColour(String colName) {
		return null;
	}
}
