package main.offer;

/*
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 */
public class offer33 {
    public static boolean help(int left,int right,int[] postorder){
        if (left>=right)return true;
        int index = left;
        while(postorder[index]<postorder[right])index++;
        int m = index;
        while(postorder[index]>postorder[right])index++;
        return index==right &&help(left,m-1,postorder)&&help(m,right-1,postorder);
    }
    public boolean verifyPostorder(int[] postorder) {
        //使用递归实现
        if (postorder.length==0)return true;
        return help(0,postorder.length-1,postorder);
    }
}
