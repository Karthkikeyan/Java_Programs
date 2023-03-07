package com.te2;

public class UserMainCode {
	static int last;
	static int product;
	static int sum;

	public static int sumofSquaresOfEvenDigits(int num) {
		while (num > 0) {

			last = num % 10;

			product = 0;
			if (last % 2 == 0) {
				product = last * last;
				sum += product;
			}
			num/=10;

		}

		return sum;
	}

}
