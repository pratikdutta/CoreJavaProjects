package threadsafesingleton;

public class ThreadSafeSingleton {
	
	private static volatile ThreadSafeSingleton instance;
	
	String x = null;
	
	private ThreadSafeSingleton(){}
	
	public static ThreadSafeSingleton getInstance(){
		if(instance == null){
			synchronized (ThreadSafeSingleton.class) {
				if(instance == null){
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	
	

}
