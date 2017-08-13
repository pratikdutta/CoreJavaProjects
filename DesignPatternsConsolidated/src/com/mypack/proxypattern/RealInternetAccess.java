package com.mypack.proxypattern;

public class RealInternetAccess implements OfficeInternetAccess {

	String empName;
	
	public RealInternetAccess(String empName) {
		super();
		this.empName = empName;
	}

	@Override
	public void grantInternetAccess(String empName) {
		 System.out.println("Internet Access granted for employee: "
				 + empName);  
	}
}
