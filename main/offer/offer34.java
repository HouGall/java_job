package main.offer;

import java.util.*;

/*
输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 */
public class offer34 {
    static List<List<Integer>> res;
    static LinkedList<Integer> step;
    public static void help(TreeNode root, int sum){
        if (root==null|| sum<0) return;
        if (sum==0){
            res.add(new ArrayList<>(step));
            return;
        }
        step.add(root.val);
        help(root.left,sum-root.val);
        step.pollLast();
        help(root.right,sum-root.val);
        step.pollLast();
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root==null)return new ArrayList<>();
        res = new LinkedList<>();
        step = new LinkedList<>();
        help(root, sum);
        return res;
    }
    public static void main(String[] args) {

    }
}
