package com.mypack.proxypattern;

public class AllowingInternetAccess {

	
	public static void main(String[] args) {
		String empname = "ASD";
		ProxyInternetAccess pia = new ProxyInternetAccess(empname);
		pia.grantInternetAccess(empname);
	}
}
