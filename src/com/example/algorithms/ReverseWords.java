package com.example.algorithms;

public class ReverseWords {

	public static void main(String[] args) {
		System.out.println(new ReverseWords().reverseWords("the sky is blue"));

	}

	public String reverseWords(String s) {
		String[] ss = s.trim().split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = ss.length - 1; i >= 0; i--) {
			if(ss[i].length() ==0){
                continue;
            }
			sb.append(ss[i]);
			if (i != 0) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
}
