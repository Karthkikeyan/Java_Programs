package com.te.stringday2;

import java.util.Iterator;

public class UserMainCode {

	public static String getFirstThreeCharacters(String str,Integer count) {
		String input=str;
		StringBuffer buffer=new StringBuffer();
		 
		if (str.length()<3) {
			for (int i = 0; i < count; i++) {
				System.out.println(str);
					
			}
			return str;
		}
		for (int i = 0; i < count; i++) {
			buffer.append(str.charAt(i));
		}
		
		for (int i = 0; i < buffer.length(); i++) {
			System.out.println(buffer);
		}
        return buffer.toString();
	}
}
