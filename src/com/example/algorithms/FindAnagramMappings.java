package com.example.algorithms;

import java.util.HashMap;
import java.util.Map;

public class FindAnagramMappings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] anagramMappings(int[] A, int[] B) {
		if (A.length == 0 || B.length == 0) {
			return new int[0];
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			map.put(A[i], i);
		}
		int[] ret = new int[A.length];
		for (int i = 0; i < B.length; i++) {
			ret[i] = map.get(B[i]);
		}
		return ret;
	}
}
