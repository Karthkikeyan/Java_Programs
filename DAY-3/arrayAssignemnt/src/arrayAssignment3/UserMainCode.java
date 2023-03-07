package arrayAssignment3;

import java.util.Scanner;

public class UserMainCode {
	static Integer largest;
	static Scanner scanner=new Scanner(System.in);
	
	public static Integer checkLargestAmongCorner(Integer size) {
		
		Integer integer []=new Integer [size];
		
		if (size%2==0) {
			System.out.println("CONDITION VIOLATED");
			return 0;
			}
		else if (size>20) {
           System.out.println("CONDITION VIOLATED");
           return 0;
		}
		else {
			for (int i = 0; i < integer.length; i++) {
				System.out.println("ENETR THE ELEMENTS");
				integer[i]=scanner.nextInt();
			}
			
		 largest=(integer[0]>integer[integer.length/2] && integer[0] >integer[integer.length-1])?integer[0]:(integer[integer.length/2]>integer[integer.length-1])?integer[integer.length/2]:integer[integer.length-1];
		}
		return largest;

	}

}
