package com.example.algorithms;

public class MergeTwoBinaryTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

		if (t1 == null && t2 == null) {
			return null;
		}
		int sum = 0;

		if (t1 != null) {
			sum += t1.val;
		}
		if (t2 != null) {
			sum += t2.val;

		}

		TreeNode ret = new TreeNode(sum);
		ret.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
		ret.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
		return ret;
	}

}
