package com.te3;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER");
		int result = UserMainCode.reverseNumber(scanner.nextInt());
		System.out.println(result);
	}
}
