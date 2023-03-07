package day10assignment2;

import java.util.Scanner;

public class Main {

	static Scanner scanner=new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("ENTER THE INPUT ");
		Boolean result=UserMainCode.leapYear(scanner.next());
		System.out.println(result);
	}
}
