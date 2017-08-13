package com.mypack.abstractfactorypattern;

public class ColourFactory extends AbstractFactory{
	
	@Override
	public Colour getColour(String colName){
		if(colName!=null){
			if(colName.equalsIgnoreCase("Red"))
				return new Red();
			if(colName.equalsIgnoreCase("Blue"))
				return new Blue();
		}
		return null;
	}

	@Override
	Shape getShape(String shapeName) {
		return null;
	}
}
