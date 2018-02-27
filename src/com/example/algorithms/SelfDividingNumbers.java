package com.example.algorithms;

import java.util.LinkedList;
import java.util.List;

public class SelfDividingNumbers {

	public static void main(String[] args) {
		System.out.println(selfDividingNumbers(66, 708));

	}

	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> ret = new LinkedList<Integer>();
		for (int i = left; i <= right; i++) {
			boolean add = true;
			int test = i;
			for (int j = 10000; j >= 1; j /= 10) {
				if (j > i)
					continue;
				int index = test / j;
				if (index == 0) {
					add = false;
					break;
				}
				test = test % j;

				if (index > 0) {
					if (i % index != 0) {
						add = false;
						break;
					}
				}

			}
			if (add) {
				ret.add(i);
			}
		}
		return ret;
	}
}
