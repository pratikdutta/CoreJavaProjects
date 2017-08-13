package pack1;

public class Test implements Runnable {

	static KoKo pp2 = new KoKo();
	
	@Override
	public void run() {
		pp2.hoho(Thread.currentThread().getId());

	}
	
	public static void  main(String ...strings) {
		new Thread(new Test()).start();
		new Thread(new Test()).start();
	}

}
