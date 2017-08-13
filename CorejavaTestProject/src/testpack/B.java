package testpack;

import java.io.IOException;

public class B extends A {
	
static {
		System.out.println("st B");
	}

B(int i){
	System.out.println("B const");
}

public static void main(String[] args) {
	A a;
}
}
