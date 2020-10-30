package offer;

/*
定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。

 */
public class offer24 {
    public ListNode reverseList(ListNode head) {
        ListNode res = new ListNode(-1);
        ListNode p = res.next;
        ListNode temp = head;
        while(temp!=null){
            ListNode step = temp.next;
            res.next = temp;
            temp.next = p;
            p = res.next;
            temp = step;
        }
        return res.next;
    }
}
