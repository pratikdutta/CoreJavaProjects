package custompack;

import java.sql.SQLException;

public class ExceptionsTest {

	public static void main(String[] args) {
		new ExceptionsTest().throwException(2);
	}
	
	private void throwException(int p){
		try{
			if(p==0){
				throw new SQLException();
			}else if(p==1){
				throw new ArrayIndexOutOfBoundsException();
			}else{
				throw new NullPointerException();
			}
		}catch(SQLException | IndexOutOfBoundsException | NullPointerException q){
			q.printStackTrace();
		}
	}
}
