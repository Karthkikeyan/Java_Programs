package com.te.collectionassignment1;

import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner=new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("ENTER THE SIZE ");
		List <Integer> result=UserMainCode.sortMergedArrayList(scanner.nextInt());
		System.out.println(result);
	}
}
