package main.offer;

import java.util.*;

/*
输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
使用栈实现
 */
 class ListNode {
     int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
public class offer06 {
    public int[] reversePrint(ListNode head) {
        if (head==null){
            return new int[0];
        }
        ListNode p = head;
        Stack<Integer> stack = new Stack<>();
        while (p!=null){
            stack.push(p.val);
            p = p.next;
        }
        int[] res = new int[stack.size()];
        for (int i1 = 0; i1 < stack.size(); i1++) {
            res[i1] = stack.pop();
        }
        return res;
    }
}
