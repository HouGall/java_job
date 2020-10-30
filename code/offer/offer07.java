package offer;

import java.util.*;

/*
输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
需要将数组转化为列表进行重建，方便对下标进行控制。
 */
public class offer07 {
    public static TreeNode help(List<Integer> preorder, List<Integer> inorder){
        if(inorder==null||inorder.size()==0)return null;
        int val = preorder.get(0);
        TreeNode root = new TreeNode(val);
        int index = inorder.indexOf(val);
        List<Integer> lino = inorder.subList(0,index);
        List<Integer> lpre = preorder.subList(1,lino.size()+1);
        List<Integer> rino = inorder.subList(index+1,inorder.size());
        List<Integer> rpre = preorder.subList(lino.size()+1,preorder.size());
        root.left = help(lpre,lino);
        root.right = help(rpre,rino);
        return root;
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;
        }
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> pre = new ArrayList<>();
        List<Integer> ino = new ArrayList<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
            pre.add(preorder[i]);
            ino.add(inorder[i]);
        }
        TreeNode root = help(pre,ino);

        return root;
    }

    public static void main(String[] args) {
        int[] pre = {3,9,20,15,7};
        int[] ino = {9,3,15,20,7};
        TreeNode root = buildTree(pre,ino);
        System.out.println(root);
    }
}
