package com.sap.methodref;

public class Implementations {
	
	public static void main(String []args){
		
		new Concert().start(new CompositeClass()::study);
		new Concert().start(CompositeStaticClass::staticStudy);
		
		//JDK
		new Concert().start(System.out::println);
		
		new Concert().start(new CompositeClass()::study, 15);
		new Concert().start(CompositeStaticClass::staticStudy, 20);
		
		//JDK
//		new Concert().start();
		
		new Concert().start(new CompositeClass()::studyAndPlay);
		new Concert().start(CompositeStaticClass::staticStudyAndPlay);
	}
}
