package offer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
    public void help(TreeNode root,int index,int[] nums){
        int len = nums.length;
        if (index<len){
            root.left = new TreeNode(nums[index]);
            help(root.left, index*2+1, nums);
        }
        if (index+1<len){
            root.right = new TreeNode(nums[index+1]);
            help(root.right,index*2+1,nums);
        }
    }
    public TreeNode buildTree(int[] nums){
        if (nums.length==0)return null;
        TreeNode root = new TreeNode(nums[0]);
        help(root,0,nums);
        return root;
    }
 }

//将二叉树转化为镜像树
public class offer27 {
    //方法1：使用辅助队列方式
    TreeNode solution1(TreeNode root){
        Queue<TreeNode> temp = new LinkedList<>();
        temp.add(root);
        while (!temp.isEmpty()){
            TreeNode node = temp.poll();
            TreeNode left = node.left;
            TreeNode right = node.right;
            if(left!=null)temp.add(left);
            if(right!=null)temp.add(right);
            node.left = right;
            node.right = left;
        }
        return root;
    }
    //方法二：使用栈的方式：
    TreeNode solution2(TreeNode root){
        Stack<TreeNode> temp = new Stack<>();
        temp.push(root);
        while (!temp.isEmpty()){
            TreeNode node = temp.pop();
            TreeNode left = node.left;
            TreeNode right = node.right;
            if(left!=null)temp.add(left);
            if(right!=null)temp.add(right);
            node.left = right;
            node.right = left;
        }
        return root;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};

    }
}
