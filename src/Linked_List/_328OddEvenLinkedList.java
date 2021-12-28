package Linked_List;

public class _328OddEvenLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
      ListNode() {

      }
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
  }
    public static ListNode oddEvenList(ListNode head) {
        if(head==null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
    public static void printNode (ListNode head){
        if(head == null) {
            System.out.println("Empty");
        }else {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val);
                temp = temp.next;
                if (temp != null){
                    System.out.print("->");
                }else {
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next= n3;
        n3.next = n4;
        n4.next = n5;
        printNode(n1);
        oddEvenList(n1);
        printNode(n1);
    }
}
