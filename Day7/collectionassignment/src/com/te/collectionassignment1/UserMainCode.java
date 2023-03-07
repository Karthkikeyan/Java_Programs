package com.te.collectionassignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserMainCode {

	static Scanner scanner=new Scanner (System.in); 
	
	public static List sortMergedArrayList(Integer size) {
	List <Integer> list=new ArrayList<Integer>();
	
	List<Integer> list1=new ArrayList <Integer> ();
	
	List <Integer> list3=new ArrayList();
	
	for (int i = 0; i <size; i++) {
		System.out.println("ENTER THE 1ST ARRAY"+i+ "VALUE");
		list.add(scanner.nextInt());
	}
	
	list3.addAll(list);
	
	
	for (int i = 0; i < size; i++) {
		System.out.println("ENTER THE 2ND "+i+ "VALUE");
		list1.add(scanner.nextInt());
	}
	
	list3.addAll(list1);
	
    
	Collections.sort(list3);
	for (Integer integer : list3) {
		System.out.println(integer);
	}
	List <Integer> result =new ArrayList ();
	for (int i = 0; i <list3.size(); i++) {
		if (i==2 || i==6 ||i==8) {
			result.add(list3.get(i));
		}
	}
	return result;
	}
}
