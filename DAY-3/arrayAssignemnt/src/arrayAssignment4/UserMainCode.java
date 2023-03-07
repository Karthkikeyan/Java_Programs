package arrayAssignment4;

import java.util.Scanner;
public class UserMainCode {
	static Scanner scanner=new Scanner (System.in);
	static Integer sum=0;
	
	public static Integer sumCommonElements (Integer array,Integer size) {
		
		Integer [] first =new Integer [array];
		
		Integer [] second =new Integer [size];
		
		for (int i = 0; i < first.length; i++) {
			 System.out.println("ENTER THE VALUES FOR FIRST ARRAY");
              first[i]=scanner.nextInt();			
		}
		
		for (int i = 0; i < second.length; i++) {
			 System.out.println("ENTER THE VALUES FOR SECOND ARRAY");
             second[i]=scanner.nextInt();			
		}
		
		for (int i = 0; i < first.length; i++) {
			
			for (int j = 0; j < second.length; j++) {
				
				if (first[i]==second[j]) {
            			sum+=first[i];
            			}
			}    
		}
		
		if (sum!=0) {
			return sum;
		}
		else
			return -1;

	}

}
