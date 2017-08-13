package string.reversal.recursive;

public class StringReversal {
	int i = 1;
	StringBuilder retStr = new StringBuilder();
	public static void main(String[] args) {

		String str = "First Max Number: 348" ;
		StringReversal sr = new StringReversal();
		String strRev = sr.reverseString(str);
		System.out.println(strRev);
	}
	
	private String reverseString(String str){
		
		if(str.length() > 0){
			retStr.append(str.substring(str.length() - 1, str.length()));
			str = str.substring(0, (str.length() - 1));
			reverseString(str);
		}else{
			return retStr.toString();
		}
		
		return retStr.toString();
	}

}
