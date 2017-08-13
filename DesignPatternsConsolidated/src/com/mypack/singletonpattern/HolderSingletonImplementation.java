package com.mypack.singletonpattern;

public class HolderSingletonImplementation {
	
	static int count = 0;
	
	private HolderSingletonImplementation(){
		count++;
	}
	
	private static class Holder{
		private static final HolderSingletonImplementation instance
			= new HolderSingletonImplementation();
	}
	
	public static HolderSingletonImplementation getInstance(){
		return Holder.instance;
	}
}
