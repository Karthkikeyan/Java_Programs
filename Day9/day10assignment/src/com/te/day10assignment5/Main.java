package com.te.day10assignment5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

	static Scanner scanner=new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("ENTER THE VALUES FOR FIRST MAP");
		
		Map <String,String> map=new HashMap();
		
		map.put(scanner.next(),scanner.next());
		
		System.out.println("ENTER THE VALUES FOR SECOND MAP ");
		
		Map <String,Integer> map1=new HashMap();
		
		map1.put(scanner.next(),scanner.nextInt());
		
		UserMainCode.calculateDiscount(map,map1);
		
	}
}
