package com.example.algorithms;

public class ReverseInteger {

	public static void main(String[] args) {

		System.out.println(reverse(1534236469));
		System.out.println(Integer.MAX_VALUE);

	}

	public static int reverse(int x) {
		boolean n = false;
		if (x < 0) {
			n = true;
			x = x * -1;
		}
		int ret = 0;
		while (x > 0) {
			if (ret > Integer.MAX_VALUE / 10) {
				return 0;
			}
			ret *= 10;
			ret += x % 10;
			x = x / 10;
		}
		if (n) {
			ret *= -1;
		}
		return (int) ret;
	}

}
