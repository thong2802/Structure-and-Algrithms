package Linked_List_06;

public class _203RemoveLinkedListElements {
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

    public ListNode removeElements(ListNode head, int val) {
        ListNode curNode = head;
        ListNode prev = null;
       if (head == null){
           return null;
       }else {
           while (curNode != null){
               boolean isFound = false;
               if (curNode.val == val){
                   // neu node có 1 phần tử thì tức là không có preNode => xoá xong return head = curNode.next;
                   isFound = true;
                   if (prev == null){
                        head = curNode.next;
                   }else {
                       prev.next = curNode.next;
                   }
               }
               prev = isFound == true ? prev : curNode;
               curNode = curNode.next;
           }
       }
       return head;
    }
    public static void main(String[] args) {

    }
}
