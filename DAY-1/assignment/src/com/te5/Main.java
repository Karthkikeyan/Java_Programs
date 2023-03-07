package com.te5;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("ENTERT THE 1st NUMBER");
		System.out.println("ENTERT THE 2nd NUMBER");
		int input = UserMainCode.addPalindrome(scanner.nextInt(), scanner.nextInt());
		System.out.println(input);
	}

}
