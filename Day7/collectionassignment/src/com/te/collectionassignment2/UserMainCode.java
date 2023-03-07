package com.te.collectionassignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UserMainCode {

	static Scanner scanner=new Scanner (System.in);
	
	public static ArrayList matchCharacters(Integer size) {
		
		String [] input=new String [size];
		
		ArrayList array=new ArrayList();
		
		
		for (int i = 0; i <input.length; i++) {
			System.out.println("ENTER THE WORDS");
			input[i]=scanner.nextLine();
		}
		
		for (int i = 0,j=0; i < input.length; i++) {
			if (input[i].startsWith("a") || input[i].startsWith("e") || input[i].startsWith("i") || input[i].startsWith("o") || input[i].startsWith("u") && input[i].endsWith("a") || input[i].endsWith("e") || input[i].endsWith("i") || input[i].endsWith("o") || input[i].endsWith("u") )  {
				array.add(input[i]);
				
			}
		}
           return array;
	}
}
