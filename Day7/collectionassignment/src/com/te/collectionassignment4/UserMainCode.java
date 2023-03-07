package com.te.collectionassignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMainCode {
 
	static Scanner scanner=new Scanner (System.in);
	static ArrayList <Integer> list; 
	
	static ArrayList <Integer> list1=new ArrayList (); 
	
	public static ArrayList removeMultiplesOf3(Integer size) {
		
		list=new ArrayList();
		
 		 
		for (int i = 0; i <size; i++) {
			System.out.println("ENTER THE"+(i+1)+"VALUE");
			list.add(scanner.nextInt());
		}
		
		for (int i = 3; i <=size; i=i+3) {
			list1.add(list.get(i));
		}
          return list1;
	}
	
}
