package com.te.stringday;

import java.util.Scanner;

public class Main {

	static Scanner scanner=new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("ENTER THE STRING");
		String input=scanner.nextLine();
		System.out.println("ENETER THR CHARACTER");
		Character character=scanner.next().charAt(0);
		
		StringBuffer result=UserMainCode.reshape(input, character);
		System.out.println(result);
		
		
	}
}
