package com.te5;

public class UserMainCode {

	static int sum;
	static int last;
	static int reverse;
	static int temp;

	public static int addPalindrome(int lowerValue, int higherValue) {

		for (int i = lowerValue; i <= higherValue; i++) {
             temp=i;
			reverse = 0;
			while (i > 0) {

				reverse = reverse * 10 + i % 10;
				i /= 10;

			}
			if (reverse == temp ) {
				sum += reverse;

			}
			if (temp==higherValue) {
				return sum;

			}
		}
		return 0;
	}
}
