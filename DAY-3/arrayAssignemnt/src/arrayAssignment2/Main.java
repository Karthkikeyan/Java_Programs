package arrayAssignment2;

import java.util.Scanner;

import arrayAssignment1.UserMainCode;

public class Main {
 static Scanner scanner=new Scanner(System.in);
 
 public static void main(String[] args) {
	System.out.println("ENTER THE SIZE");
	Integer result=UserMainCode.getBigDiff(scanner.nextInt());
	System.out.println(result);
}
}
