package com.te.stringday3;

import java.util.Iterator;
import java.util.Scanner;

public class UserMainCode {

	static Scanner scanner=new Scanner(System.in);
	public static String newString(Integer size,Integer count ) {
	
		String [] strings=new String [size];
		for (int i = 0; i < strings.length; i++) {
			System.out.println("ENTER THE STRING");
			strings[i]=scanner.nextLine();
		}
	     StringBuffer buffer=new StringBuffer();
		 for (int i = 0; i < strings.length; i++) {
			
			  try {
				  buffer.append(strings[i].charAt(count));
			} catch (Exception e) {
			      buffer.append("$");
			}
		}
		 
		 System.out.println(buffer);
		 return buffer.toString();
  }
	
	
}
