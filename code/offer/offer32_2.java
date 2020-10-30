package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
保存每一层的节点
 */
public class offer32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int queuelen = queue.size();
            List<Integer> step = new ArrayList<>();
            for(int i=0;i<queuelen;i++){
                TreeNode temp = queue.poll();
                step.add(temp.val);
                if (temp.left!=null)queue.add(temp.left);
                if (temp.right!=null) queue.add(temp.right);
            }
            res.add(new ArrayList<>(step));
        }
        return res;
    }

}
