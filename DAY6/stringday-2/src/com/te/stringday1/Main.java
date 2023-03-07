package com.te.stringday1;

import java.util.Scanner;

public class Main {

	static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("ENTER THE STRING");
		Integer result=UserMainCode.getSubstring(scanner.nextLine(),scanner.nextLine());
		System.out.println(result);
	}
}
