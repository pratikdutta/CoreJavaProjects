package com.mypack.proxypattern;

public class ProxyInternetAccess implements OfficeInternetAccess {
	String empName;
	RealInternetAccess realAccess;
	
	public ProxyInternetAccess(String empName) {
		this.empName = empName;
	}

	@Override
	public void grantInternetAccess(String empName) {
		if(getJobCode(empName)>2){
			realAccess = new RealInternetAccess(empName);
			realAccess.grantInternetAccess(empName);
		}else{
			System.out.println("Internet Access Denied");
		}
	}
	
	private int getJobCode(String empName) {
		return 2;
	}
}
