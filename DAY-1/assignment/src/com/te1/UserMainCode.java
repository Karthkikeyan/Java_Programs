package com.te1;

public class UserMainCode {
	static int sum;
	static int last;
	
	public static int checkSum(int num) {
		while (num>0) {
			last=num%10;
			if (last%2!=0) {
				sum+=last;
			}
			
			num/=10;	
		}
				if (sum%2!=0) {
					return 1;	
				}
				return -1;

	}

}
