package com.example.algorithms;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}

	public static String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		String split[] = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			if (i != 0) {
				sb.append(" ");
			}
			sb.append(reverseString(split[i]));
		}
		return sb.toString();
	}

	public static String reverseString(String s) {
		char seq[] = s.toCharArray();
		for (int i = 0; i < seq.length / 2; i++) {
			char t = seq[i];
			seq[i] = seq[seq.length - i - 1];
			seq[seq.length - i - 1] = t;
		}
		return new String(seq);
	}
}
