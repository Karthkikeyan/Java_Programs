package arrayAssignemnt;


import java.util.Scanner;
public class Main {
 
	static Scanner scanner=new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("ENTER THE SIZE FOR THE ARRAY");
		Integer input=UserMainCode.getSumOfPower(scanner.nextInt());
		System.out.println(input);
		
	}
}
