package arrayAssignment3;

import static arrayAssignment3.UserMainCode.*;
import java.util.Scanner;

public class Main {

	static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("ENTER THE SIZE");
		Integer result=checkLargestAmongCorner(scanner.nextInt());
		System.out.println(result);
	}
}
