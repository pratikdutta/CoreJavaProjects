package testpack;

public class Test {

	public static void main(String[] args) {
//		new C().show(null);
		

	}
	
	@SuppressWarnings("finally")
	int check(){
		try{
			System.out.println("try");
			System.exit(0);
			return 1;
		}catch(Exception e){
			System.out.println("catch");
			return 2;
		}finally{
			System.out.println("finally");
			return 3;
		}
	}

}
