package com.mypack.singletonpattern;

import java.lang.reflect.Constructor;

public class BreakSinglrton {

	public static void main(String[] args) {
		HolderSingletonImplementation instance01 
			= HolderSingletonImplementation.getInstance();
		
		HolderSingletonImplementation instance02 = null;
		
		try{
			Constructor[] consts 
				= HolderSingletonImplementation.class.getDeclaredConstructors();
			for(Constructor<HolderSingletonImplementation> c : consts){
				c.setAccessible(true);
				instance02 = (HolderSingletonImplementation) c.newInstance(null);
				break;
			}
		}catch(Exception e){
			System.out.println("Not Possible");
			e.printStackTrace();
		}
		System.out.println(instance01.count);
		System.out.println(instance02.count);
	}

}
