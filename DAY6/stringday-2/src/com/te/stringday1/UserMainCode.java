package com.te.stringday1;

import java.util.StringTokenizer;

public class UserMainCode {
	
	static Integer count=0;
	public static Integer getSubstring(String s1,String s2) {
		while (s1.contains(s2)) {
			s1=s1.replaceFirst(s2,"now");
			count++;
		} 
      return count;
	}
	
}


