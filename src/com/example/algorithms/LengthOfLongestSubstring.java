package com.example.algorithms;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
		System.out.println(lengthOfLongestSubstring(""));
		
		
	}
	public static int lengthOfLongestSubstring(String s) {
		int max =0;
		for(int i=0;i<s.length();i++) {
			boolean code[] = new boolean[Character.MAX_VALUE];
			int length=0;
			for(int j =i ;j< s.length();j++) {
				char c = s.charAt(j);
				if(!code[c]) {
					code[c]=true;
					length ++;
				}else {
					break;
				}
			}
			
			max = length>max?length:max;
		}
		return max;
	}
}
