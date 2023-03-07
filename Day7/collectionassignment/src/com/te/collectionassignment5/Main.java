package com.te.collectionassignment5;

import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner scanner=new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("ENTER THE SIZE & SIZE1");
		List result = UserMainCode.arrayListSubstractor(scanner.nextInt(),scanner.nextInt());
		System.out.println(result);
	}

}
