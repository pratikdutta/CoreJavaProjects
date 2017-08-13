package threadsafesingleton;

public class Usage {

	public static void main(String[] args) {
		
		ThreadSafeSingleton ths = ThreadSafeSingleton.getInstance();
		ths.setX("SUVA1");
		
		ThreadSafeSingleton ths1 = ThreadSafeSingleton.getInstance();
		System.out.println(ths1.getX());
	}

}
