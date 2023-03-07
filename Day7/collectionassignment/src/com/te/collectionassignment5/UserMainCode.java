package com.te.collectionassignment5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserMainCode {
 static Scanner scanner=new Scanner(System.in);
 static Integer count=0;
 public static List arrayListSubstractor(Integer size,Integer size1) {
	List<Integer > list=new ArrayList();
	
	List<Integer> list2=new ArrayList();
	
	List<Integer> list3=new ArrayList();
	
	for (int i = 0; i <size; i++) {
		System.out.println("ENTER THE ELEMENT");
		list.add(scanner.nextInt());
	}
	for (int j = 0; j < size1; j++) {
		System.out.println("ENTER THE ELEMENT");
		list2.add(scanner.nextInt());
	}
	
	 for (int i = 0; i < size; i++) {
		count=0;
		for (int j = 0; j < size1; j++) {
			
			if (list.get(i)!=list2.get(j)) {
				count++;
			}
			
			} if (count==size1) {
			list3.add(list.get(i));
			
		}
	}
	 for (int i = 0; i < size; i++) {
			count=0;
			for (int j = 0; j < size1; j++) {
				
				if (list2.get(i)!=list.get(j)) {
					count++;
				}
				
				} if (count==size1) {
				list3.add(list2.get(i));
				
			}
		}
     return list3;
}


}
