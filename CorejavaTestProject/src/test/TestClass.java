package test;

import java.util.Date;

public class TestClass {

	public static void main(String[] args) {
		Date d1 = new Date(99, 11, 31);
		Date d2 = new Date(99, 11, 31);
		meth(d1,d2);
		System.out.println("d1="+d1+"\nd2="+d2);
	}
	
	public static void meth(Date d1, Date d2) {
		d2.setYear(100);
		d1 = d2;
	}

}
