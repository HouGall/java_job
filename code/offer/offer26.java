package offer;


/*
输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
B是A的子结构， 即 A中有出现和B相同的结构和节点值。
多做几次
 */
public class offer26 {
    public static boolean help(TreeNode root1, TreeNode root2){
        if(root2==null)return true;
        if (root1==null || root1.val!=root2.val)return false;
        return help(root1.left,root2.left) && help(root1.right,root2.right);
    }

    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A==null) return false;
        if (B==null) return false;
        return help(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);
    }

    public static void main(String[] args) {

//        System.out.println(isSubStructure(A,B));
    }
}
