package com.te.collectionassignment3;

import java.util.Scanner;

public class Main {

	static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("ENTER THE SIZE");
		
		String [] str=UserMainCode.convertToStringArray(scanner.nextInt());
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
