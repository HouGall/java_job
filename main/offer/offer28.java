package main.offer;

/*
请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 */
public class offer28 {
    public static boolean help(TreeNode left,TreeNode right){
        if (left==null && right==null) return true;
        if (left==null || right==null || left.val!=right.val)return false;
        return help(left.left,right.right) && help(left.right,right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return false;
        return help(root.left,root.right);
    }
}
