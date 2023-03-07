package com.te6;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("ENTER THE NUMBER");
		Integer input = UserMainCode.getSumOfFibos(scanner.nextInt());
		System.out.println(input);
	}

}
