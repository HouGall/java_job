package offer;

import java.util.*;

/*
请实现一个函数按照之字形顺序打印二叉树，
即第一行按照从左到右的顺序打印，
第二层按照从右到左的顺序打印，
第三行再按照从左到右的顺序打印，其他行以此类推。
z字形打印

 */
public class offer32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null)return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int flag = 0;
        while (!queue.isEmpty()){
            int queuelen = queue.size();
            List<Integer> step = new ArrayList<>();
            for (int i = 0; i < queuelen; i++) {
                TreeNode temp = queue.poll();
                step.add(temp.val);
                if(temp.left!=null)queue.add(temp.left);
                if (temp.right!=null) queue.add(temp.right);
            }
            if (flag%2==0){
                res.add(new ArrayList<>(step));
            }
            else {
                Collections.reverse(step);
                res.add(new ArrayList<>(step));
            }
            flag++;
        }
        return res;
    }
}
