package com.te2;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER");
		int res = UserMainCode.sumofSquaresOfEvenDigits(scanner.nextInt());
		System.out.println(res);
	}

}
