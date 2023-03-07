package com.te.arrayassignment4;

import java.util.Scanner;

public class Main {

	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("ENTER THE SIZE");
		Boolean result=UserMainCode.checKTriplets(scanner.nextInt());
		System.out.println(result);
	}
}
