package com.example.algorithms;

import java.util.HashSet;

public class NumJewelsInStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int numJewelsInStones(String J, String S) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (char c : J.toCharArray()) {
			set.add((int) c);
		}
		int sum = 0;
		for (char c : S.toCharArray()) {
			if (set.contains((int) c)) {
				sum++;
			}
		}
		return sum;
	}
}
