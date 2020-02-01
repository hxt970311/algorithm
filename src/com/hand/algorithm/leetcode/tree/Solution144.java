package com.hand.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 144. 二叉树的前序遍历
 */
public class Solution144 {
    List<Integer> result = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        helper(root);
        return result;
    }

    private void helper(TreeNode root) {
        if (root == null) return;
        result.add(root.val);
        helper(root.left);
        helper(root.right);
    }
}
