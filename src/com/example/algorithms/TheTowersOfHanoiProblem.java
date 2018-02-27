package com.example.algorithms;

public class TheTowersOfHanoiProblem {

	public static void main(String[] args) {
		move(10, "A", "B", "C");

	}

	public static void move(int n, String from, String temp, String to) {
		if (n == 1) {
			println(from + " - " + n + " -> " + to);
		} else {
			move(n - 1, from, to, temp);
			println(from + " - " + n + " -> " + to);
			move(n - 1, temp, from, to);
		}
	}

	private static void println(String string) {
		System.out.println(string);
	}
}
