package com.te.stringday;

public class UserMainCode {
	static String input;
	public static StringBuffer reshape(String input,Character data ) {
		
		 input=input;
		 
		 StringBuffer sb=new StringBuffer (input);

		 sb.reverse();
		 
		 StringBuffer out=new StringBuffer();
		 
		 for (int i = 0; i <sb.length(); i++) {
			out.append(sb.charAt(i)+data.toString());
		}
		 out.deleteCharAt(out.length()-1);
		 return out;
	}

}
