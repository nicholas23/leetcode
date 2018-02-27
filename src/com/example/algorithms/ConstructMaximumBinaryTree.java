package com.example.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructMaximumBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 1, 6, 0, 5 };
		TreeNode root = new ConstructMaximumBinaryTree().constructMaximumBinaryTree(nums);

		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);

		while (!q.isEmpty()) {
			TreeNode n = q.poll();
			if (n != null) {
				System.out.println(n.val + ",");
				q.offer(n.left);
				q.offer(n.right);
			} else {
				System.out.println("null,");
			}
		}

	}

	public TreeNode constructMaximumBinaryTree(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		TreeNode root = makeNode(nums, 0, nums.length - 1);
		return root;
	}

	public TreeNode makeNode(int[] nums, int start, int end) {
		if (start > end) {
			return null;
		}
		int maxIndex = findMax(nums, start, end);
		TreeNode node = new TreeNode(nums[maxIndex]);
		node.left = makeNode(nums, start, maxIndex - 1);
		node.right = makeNode(nums, maxIndex + 1, end);
		return node;
	}

	private int findMax(int[] nums, int start, int end) {
		int index = 0;
		int max = Integer.MIN_VALUE;
		for (int i = start; i <= end; i++) {
			if (nums[i] > max) {
				max = nums[i];
				index = i;
			}
		}
		return index;
	}

}
