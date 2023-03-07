package com.te6;

public class UserMainCode {
	static Integer num1=0;
	static Integer num2=1;
	static Integer num3;
	
  
	public static int getSumOfFibos(Integer num) {
		  for (int i = 2; i <num; i++) {
			
		
		num3=num1+num2;
		num1=num2;
		num2=num3;
		
		  }
		return num3;
	}
}
