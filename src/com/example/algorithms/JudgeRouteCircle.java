package com.example.algorithms;

public class JudgeRouteCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean judgeCircle(String moves) {
		if (moves.length() == 0) {
			return true;
		}
		moves = moves.toUpperCase();
		int x = 0, y = 0;
		for (char c : moves.toCharArray()) {
			switch (c) {
			case 'U':
				y++;
				break;
			case 'D':
				y--;
				break;
			case 'R':
				x++;
				break;
			case 'L':
				x--;
				break;
			default:
				break;
			}
		}
		return x == 0 && y == 0;
	}
}
