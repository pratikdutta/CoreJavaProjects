package innerclass;

public class InnerClassTest {
	
	
	static class X1{
		
		String s1 = "X1";
		
		static class X2{
			String s2 = "X2";
		}
	}
	
	public static void main(String ...strings){
		InnerClassTest.X1.X2 x2 = new InnerClassTest.X1.X2();
		
		System.out.println(x2.s2);
	}

}
