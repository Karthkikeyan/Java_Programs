package arrayAssignment1;

import java.util.Arrays;
import java.util.Scanner;

public class UserMainCode {

	static Scanner scanner=new Scanner (System.in);
	public static Integer getBigDiff(Integer size) {
		Integer [] input=new Integer [size];
		
		
		for (int i = 0; i < input.length; i++) {
			if (input.length==1) {
				System.out.println("ENTER THE VALUE");
				input[i]=scanner.nextInt();
				return input[i];
			}
			else {
				System.out.println("ENTER THE NUMBER");
				input[i]=scanner.nextInt();
			}
			
			}	
				
		Arrays.sort(input);
	
		return input[input.length-1]-input[0];
	}
}
