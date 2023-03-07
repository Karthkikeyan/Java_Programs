package com.te.collectionassignment3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserMainCode {

	static Scanner scanner=new Scanner (System.in);
	
	public static String[] convertToStringArray(Integer size) {
		
		ArrayList <String> list=new ArrayList();
		
		for (int i = 0; i < size; i++) {
			System.out.println("ENTER THE"+(i+1)+ "STRING");
			list.add(scanner.next());
		}
		
		Collections.sort(list);
		 return list.toArray(new String[list.size()]);
		 
		 
	} 
}
