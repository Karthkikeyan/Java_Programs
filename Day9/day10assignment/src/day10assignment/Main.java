package day10assignment;

import java.util.Scanner;

public class Main {

	static Scanner scanner=new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("ENTER THE DATE");
		String age=UserMainCode.getAge(scanner.next());
		System.out.println(age);
	}
}
