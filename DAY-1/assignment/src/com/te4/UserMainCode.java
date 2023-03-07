package com.te4;

public class UserMainCode {
	static int last;
	static int count;

	public static int countSeven(int number) {
		while (number > 0) {
			last = number % 10;
			
			if (last == 7) {
				count++;
			}
			number /= 10;
		}

		return count;

	}

}
