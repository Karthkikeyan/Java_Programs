package com.te.arrayassignment1;

import java.util.Arrays;
import java.util.Scanner;

public class UserMainCode {

	static Scanner scanner=new Scanner (System.in);
	
	public static void removeTens(Integer size) {
		Integer [] input=new Integer[size];
		
		for (int i = 0; i < input.length; i++) {
			System.out.println("ENTER THE ELEMENTS");
			input[i]=scanner.nextInt();
		}

		for (int j = 0; j < input.length; j++) {
			if (input[j]==10) {
				input[j]=0;
			}
		}
		
		Arrays.sort(input);
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}
}
