package com.te.collectionassignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner scanner=new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("ENTER THE SIZE");
		ArrayList <Integer> result=UserMainCode.removeMultiplesOf3(scanner.nextInt());
		System.out.println(result);
	}
}
