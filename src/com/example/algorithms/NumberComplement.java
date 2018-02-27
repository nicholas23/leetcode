package com.example.algorithms;

public class NumberComplement {

	public static void main(String args[]) {
		System.out.println(findComplement(5));
	}

	public static int findComplement(int num) {
		int i = 1;
		while (i <= num) {
			i <<= 1;
			if (i < 0) {
				return num ^ Integer.MAX_VALUE;
			}
		}
		i -= 1;
		return num ^i ;
	}
}
