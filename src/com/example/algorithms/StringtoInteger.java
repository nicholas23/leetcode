package com.example.algorithms;

public class StringtoInteger {
	public static void main(String args[]) {
		// System.out.println(myatoi("2147483648"));
		// System.out.println(myatoi("-2147483648"));
		// System.out.println(myatoi("2147483647"));
		// System.out.println(myatoi("-2147483647"));
		// System.out.println(myatoi("-2147483649"));
		System.out.println(myatoi("   -11919730356x"));
	}

	public static int myatoi(String str) {
		int ret = 0;
		boolean n = false;
		boolean start = false;
		for (char c : str.toCharArray()) {
			if (c == 32) {
				if (start) {
					break;
				}
				continue;
			}
			if (c == '-' || c == '+') {
				if (c == '-') {
					n = true;
				}
				if (start) {
					break;
				}
				if (!start) {
					start = true;
				} else {
					break;
				}
				continue;
			}

			if (c < '0' || c > '9') {
				break;
			}
			if (ret > Integer.MAX_VALUE / 10) {
				if (n) {
					return Integer.MIN_VALUE;
				} else {
					return Integer.MAX_VALUE;
				}
			}
			if (ret == Integer.MAX_VALUE / 10 && c - '0' > 7) {
				if (n) {
					return Integer.MIN_VALUE;
				} else {
					return Integer.MAX_VALUE;
				}
			}

			start = true;
			ret *= 10;
			ret += (c - '0');
		}
		if (n) {
			ret *= -1;
		}
		return ret;
	}
}
