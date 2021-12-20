package Linked_List_06;

public class  _21MergeTwoSortedLists1 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {

        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;

        ListNode head = null;
        ListNode temp = null;

        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                // chon l1
                if (head == null){
                    head = l1;
                    temp = l1;
                    l1 = l1.next;
                }else {
                    temp.next = l1;
                    l1= l1.next;
                }
            }else {
                // chon l2
            }
        }

     return head;
    }
}
