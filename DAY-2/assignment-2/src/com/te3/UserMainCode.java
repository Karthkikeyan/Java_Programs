package com.te3;

public class UserMainCode {
	
	public static Integer getLuckySum(Integer num1,Integer num2,Integer num3) {
		Integer sum=0;
		if(num1==13 && num2==13 && num3==13) {
			return sum;
	}
		else if (num1==13 && 	num2==13) {   
		  return sum;
		}
		else if (num1==13) {   
			  return sum=num3;
			}
		else if (num2==13) {   
			  return sum=num1;
			}
		else if (num3==13) {   
			  return sum=num1+num2;
			}
		else
			return sum=num1+num2+num3;
		}

}
