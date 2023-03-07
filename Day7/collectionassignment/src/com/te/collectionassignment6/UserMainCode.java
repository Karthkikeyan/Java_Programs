package com.te.collectionassignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserMainCode {
 
	static Scanner scanner=new Scanner (System.in);
	static List <Integer> list3=new ArrayList();
	static List <Integer> list1=new ArrayList();
	static List <Integer> list2=new ArrayList();
	public static void generateOddEvenList(Integer size) {
		 
        for (int i = 0; i <size; i++) {
			System.out.println("ENTER THE ODD ELEMENT");
			list1.add(scanner.nextInt());
		}
		
		for (int i = 0; i <size; i++) {
			System.out.println("ENTER THE EVEN ELEMENT");
			list2.add(scanner.nextInt());
		}
		
		for (int i = 0,j=0; i < size; i++) {
			if (list1.get(i)%2==0 && j%2==0) {
				list3.add(j, list1.get(i));
				}
			
		}
		Collections.sort(list3);
		for (int i = 0,j=0; i < size; i++,j++) {
			if (list2.get(i)%2!=0 && j%2!=0) {
				list3.add(j, list2.get(i));
			}
			
		}
		//Collections.sort(list3);
		System.out.println(list3);
		//for (int i = 0; i < size; i++) {
			//if (list2.get(i)%2!=0) {
				//for (int j = 0; j <size;j++) {
					//if (j%2!=0) {
						//list3.add(j,list2.get(i));	
					//}
				//}
			//}
		}                   
	   //System.out.println(list3);
	}

