package com.te.stringday2;

import java.util.Scanner;

public class Main {
  
	static Scanner scanner=new Scanner(System.in);
	public static void  main(String[] args) {
		System.out.println("ENTER THER STRING AND COUNT");
		
		String result=UserMainCode.getFirstThreeCharacters(scanner.nextLine(),scanner.nextInt());
		
	}
}
