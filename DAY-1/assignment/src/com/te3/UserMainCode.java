package com.te3;

public class UserMainCode {

	static int reverse;

	public static int reverseNumber(int number) {

		while (number > 0) {
			reverse = reverse * 10 + number % 10;
			number /= 10;
		}

		return reverse;

	}

}
