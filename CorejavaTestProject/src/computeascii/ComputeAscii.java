package computeascii;

import java.io.UnsupportedEncodingException;

public class ComputeAscii {

	public static void main(String[] args) {
		String s = "admin";
	    try {
			byte[] bytes = s.getBytes("US-ASCII");
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
