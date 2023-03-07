package com.te.day10assignment;

import java.util.Scanner;

public class Main {
	
   static Scanner scanner=new Scanner (System.in);
   
	public static void main(String[] args) {

	System.out.println("ENTER THE DATE");
	Integer day=UserMain.getLastdate(scanner.next());
	System.out.println(day);
}
}
