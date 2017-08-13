package test;

public class GotoGood extends Thread{

	private int x=2;
	
	public static void main(String ...strings) throws Exception{
		new GotoGood().makeItSo();
	}

	public GotoGood() {
		System.out.println("test");
		
		x = 5;
		start();
	}
	
	public void makeItSo() throws Exception {
		join();
		x= x-1;
		System.out.println(x);
	}
	
	public void run() {
		System.out.println("run");
		x*=2;
		
	}
	
	
}
