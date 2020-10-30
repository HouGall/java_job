package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。

 */
public class offer32_1 {
    public int[] levelOrder(TreeNode root) {
        if (root==null) return new int[0];
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode step = queue.poll();
            res.add(step.val);
            if (step.left!=null)queue.add(step.left);
            if (step.right!=null) queue.add(step.right);
        }
        int[] result = new int[res.size()];
        for (int i=0;i<res.size();i++){
            result[i] = res.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();

    }
}
