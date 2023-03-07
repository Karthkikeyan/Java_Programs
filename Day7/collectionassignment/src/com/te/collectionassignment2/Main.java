package com.te.collectionassignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner scanner=new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("ENTER THE SIZE");
		ArrayList result=UserMainCode.matchCharacters(scanner.nextInt());
		for (Object object : result) {
			System.out.println(object);
		}
	}
}
