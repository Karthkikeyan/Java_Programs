package day10assignment;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class UserMainCode {

	static Scanner scanner =new Scanner (System.in);
	
	
	
	public static String getAge(String input){
		
		LocalDate given=LocalDate.parse(input);	

		System.out.println("ENTER THE DATE");
		
		String check=scanner.next();
		
		int years = Period.between(LocalDate.parse(check),given).getYears();
		System.out.println(years);
		if (years>18) {
			return "ELIGIBLE";
		}
		return "NOTELIGIBLE";
	}
}
