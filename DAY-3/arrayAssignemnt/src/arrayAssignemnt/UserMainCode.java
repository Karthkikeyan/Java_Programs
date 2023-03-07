package arrayAssignemnt;

import java.util.Iterator;
import java.util.Scanner;

public class UserMainCode {

	static Integer product;
	static Integer sum;
	static Scanner scanner = new Scanner(System.in);

	public static Integer getSumOfPower(Integer size) {

		Integer[] input = new Integer[size];

		for (int i = 0; i < input.length; i++) {
			System.out.println("ENTER THE NUMBER");
			input[i] = scanner.nextInt();
		}
		//for product
		for (int i = 0; i < input.length; i++) {
			if (i==0) {
				product=1;
				sum=1;
			}
			
	else {
	product=1;
			for (int j = 1; j<=i; j++) {
				product=product*input[i];
				
			}
			sum+=product;
	
			}
	
	System.out.println(sum);
		}
		return sum;
	}
	
}

