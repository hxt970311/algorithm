package com.hand.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 590. N叉树的后序遍历
 */
public class Solution590 {
    List<Integer> result = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        helper(root);
        return result;
    }

    private void helper(Node root) {
        if (root == null) return;
        for (Node node : root.children) {
            helper(node);
        }
        result.add(root.val);
    }
}
