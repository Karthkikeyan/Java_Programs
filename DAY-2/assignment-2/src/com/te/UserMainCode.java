package com.te;

public class UserMainCode {
	public static Integer getSumOfSquareDigits(Integer num) {
		Integer sum = 0;
		Integer square = 1;
		Integer last = 0;
		Integer temp = num;
		while (num > 0) {
			last = num % 10;
			square = last * last;
			sum += square;
			num = num / 10;
		}

		return sum;
	}
}
