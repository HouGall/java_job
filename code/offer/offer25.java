package offer;

/*
输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
采用一个额外的节点保存两个链表
 */
public class offer25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode step = res;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                ListNode temp = l1.next;
                step.next = l1;
                l1 = temp;
            }
            else{
                ListNode temp = l2.next;
                step.next = l2;
                l2 = temp;
            }
            step = step.next;
        }
        if (l1 ==null){
            step.next = l2;
        }
        if(l2==null){
            step.next = l1;
        }
        return res.next;

    }
}
