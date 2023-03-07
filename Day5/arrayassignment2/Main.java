package com.te.arrayassignment3;

import java.util.Scanner;

public class Main {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("ENTER THE ARRAY SIZE AND NUMBER");
		Integer result=UserMainCode.addAndReverse(scanner.nextInt(),scanner.nextInt());
		System.out.println(result);
	}

}
