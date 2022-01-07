package Linked_List;

public class _24SwapNodesinPairs {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode swapPairs(ListNode head) {
        // BTCS
          if (head == null)
              return null;
          if (head.next == null)
              return head;
          // THTQ
           ListNode nextNode = head.next;
           // SWAP HEAD AND NEXTNODE
           head.next = nextNode.next;
           nextNode.next = head;

           // xu li bai toan con
            ListNode newHead = swapPairs(head.next);
           // noi bai toan hien tai vao bai toan con
            head.next = newHead;

            return nextNode;
    }
    public static void main(String[] args) {

    }
}
