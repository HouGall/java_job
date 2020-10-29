package bishi;

import java.util.Arrays;
import java.util.Scanner;
/*
一个二叉树深度为k，节点取值为自然数,k<=5，找出不在树中的最小自然数，需要给出O(N)的算法。
 */
public class Xiao_hong_shu_Main1 {
    static int findMin(int[] tree) {
        Arrays.sort(tree);
        int res = 1;
        for (int num:tree) {
            if (num < res){
                continue;
            }
            else if( num==res){
                res+=1;
            }
            else break;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _tree_size = 0;
        _tree_size = Integer.parseInt(in.nextLine().trim());
        int[] _tree = new int[_tree_size];
        int _tree_item;
        for(int _tree_i = 0; _tree_i < _tree_size; _tree_i++) {
            _tree_item = Integer.parseInt(in.nextLine().trim());
            _tree[_tree_i] = _tree_item;
        }

        res = findMin(_tree);
        System.out.println(String.valueOf(res));

    }
}
