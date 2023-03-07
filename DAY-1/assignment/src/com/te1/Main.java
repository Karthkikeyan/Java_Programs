package com.te1;

import java.util.Scanner;

 
public class Main {

	static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER");
		Integer res=UserMainCode.checkSum(scanner.nextInt());
		System.out.println(res);
	}

}
