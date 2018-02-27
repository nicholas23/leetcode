package com.example.algorithms;

public class HammingDistance {

	public static void main(String[] args) {
		System.out.println(hammingDistance(1, 4));
	}

	public static int hammingDistance(int x, int y) {
		int xor = x ^ y;
		int c = 0;
		while (xor > 0) {
			if ((xor & 1) == 1) {
				c++;
			}
			xor = xor >> 1;
		}

		return c;
	}
}
