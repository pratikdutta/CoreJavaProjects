package com.mypack.abstractfactorypattern;

public abstract class AbstractFactory {
	abstract Colour getColour(String colName);
	abstract Shape getShape(String shapeName);
}
