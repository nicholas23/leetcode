package com.example.algorithms;

import java.util.LinkedList;
import java.util.List;

public class KeyboardRow {

	public static void main(String[] args) {
		findWords(new String[] { "Hello", "Alaska", "Dad", "Peace" });
	}

	public static String[] findWords(String[] words) {
		List<String> list = new LinkedList<String>();
		String[] rows = new String[] { "qwertyuiop", "asdfghjkl", "zxcvbnm" };
		for (String word : words) {
			String test = word.toLowerCase();
			if (test.length() == 0) {
				continue;
			}
			String keychar = "";
			String f = test.substring(0, 1);

			if (rows[0].contains(f)) {
				keychar = rows[1] + rows[2];
			} else if (rows[1].contains(f)) {
				keychar = rows[0] + rows[2];
			} else {
				keychar = rows[0] + rows[1];
			}
			boolean add = true;
			for (char c : keychar.toCharArray()) {
				if (test.indexOf(c) > -1) {
					add = false;
					break;
				}
			}
			if (add) {
				list.add(word);
			}
		}
		String[] ret = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			ret[i] = list.get(i);
		}
		return ret;
	}

}
