package com.hand.algorithm;

import java.util.ArrayList;

/**
 * 二叉树中和为某一值的路径：
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径
 * 注意：在返回值的list中，数组长度大的数组靠前
 */
public class Solution24 {
    private ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    private ArrayList<Integer> tmpList = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        //递归终止条件
        if (root == null) return result;
        //处理当前层逻辑
        tmpList.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null)
            result.add(new ArrayList<>(tmpList));
        //下探到下一层
        FindPath(root.left, target);
        FindPath(root.right, target);
        //清理当前层
        tmpList.remove(tmpList.size() - 1);
        return result;
    }
}
