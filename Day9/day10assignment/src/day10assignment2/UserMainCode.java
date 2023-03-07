package day10assignment2;

import java.util.Scanner;

public class UserMainCode {

	static Scanner scanner=new Scanner (System.in);
	
	public static Boolean leapYear(String input) {
		
		
		String[] split = input.split("-");
		
		Integer year=Integer.parseInt(split[2]);
		if (year%4==0) {
			return true;
		}
		return false;
		
		

	}
}
