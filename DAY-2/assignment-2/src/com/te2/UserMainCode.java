package com.te2;

import java.util.ArrayList;

public class UserMainCode {
	public static Integer validateNumber(Integer num1) {
		Integer count = 0;
		Integer temp = num1;
		Integer add = 0;

		ArrayList arrayList = new ArrayList();
		for (int i = 1; i <= num1; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count != 2) {
				add+=i;
			
			}
		
		}
		
		return sum(add);
	}
	
	public static Integer sum(Integer add) {
		Integer output=add;
		
		return output;
	}

}
