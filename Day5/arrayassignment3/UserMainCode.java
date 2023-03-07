package com.te.arrayassignment4;

import java.util.Scanner;

public class UserMainCode {

	static Scanner scanner=new Scanner(System.in);
	
	public static boolean checKTriplets(Integer size) {
		Integer [] input=new Integer [size];
		boolean decide=false;
          for (int i = 0; i < input.length; i++) {
			System.out.println("ENTER THE ELEMENTS");
			input[i]=scanner.nextInt();
		}
          for (int i = 0; i < size/2; i++) {
			if (input[i]==input[i+1] && input[i]==input[i+2]) {
				 decide=true;
			}
		   
		}
		return decide;
	}
}
