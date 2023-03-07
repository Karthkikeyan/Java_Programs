package com.te.arrayassignment3;

import java.util.Scanner;

public class UserMainCode {

	static Scanner scanner=new Scanner(System.in);
	static Integer sum=0;
	static Integer reverse=0;
	public static Integer addAndReverse(Integer size,Integer number) {
		Integer [] input=new Integer [size];
		
		for (int i = 0; i < input.length; i++) {
			System.out.println("ENTER THE ELEMENTS");
			input[i]=scanner.nextInt();
		}
		for (int i = 0; i < input.length; i++) {
			if (input[i]>number) {
				sum+=input[i];
			}
		}
		while (sum>0) {
			reverse=reverse*10+sum%10;
			sum/=10;
		}
        return reverse;
	}
}
