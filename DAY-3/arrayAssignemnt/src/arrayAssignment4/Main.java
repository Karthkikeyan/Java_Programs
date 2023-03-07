package arrayAssignment4;

import java.util.Scanner;

import static arrayAssignment4.UserMainCode.*; 

public class Main {
  	
     static Scanner scanner =new Scanner (System.in);
     
     public static void main(String[] args) {
    	 
		System.out.println("ENTER THE NUMBER");
		 
		Integer result=sumCommonElements(scanner.nextInt(),scanner.nextInt());
		
		System.out.println(result);
	}
}
