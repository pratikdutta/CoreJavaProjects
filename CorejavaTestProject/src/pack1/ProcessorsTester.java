package pack1;

public class ProcessorsTester {

	public static void main(String[] args) {
		System.out.println("Processors: "+java.lang.Runtime.getRuntime().availableProcessors());
		System.out.println("FreeMemory: "+java.lang.Runtime.getRuntime().freeMemory());
		System.out.println("TotalMemory: "+java.lang.Runtime.getRuntime().totalMemory());
	}
}
