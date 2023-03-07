package com.te.day10assignment4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner=new Scanner (System.in);
	static Map <String,Float> map=new HashMap();
	
	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER MAP OF DEVICES U WANT TO ADD");
		Integer input=scanner.nextInt();
		
		
		for (int i = 0; i <input; i++) {
			map.put(scanner.next(),scanner.nextFloat());
		}
		System.out.println("ENTER THE DEVICE");
		Integer inpt=scanner.nextInt();
		
		String [] str=new String [inpt];
		
		for (int i = 0; i <inpt; i++) {
			System.out.println("ENTER THE DEVICE");
			str[i]=scanner.next();
		}
		
		Float res=UserMainCode.costEstimator(map, str);
		System.out.println(res);
	}
}
