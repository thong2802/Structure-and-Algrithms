package Linked_List_06;

public class _160IntersectionofTwoLinkedLists {
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }
  //solution 1: O(n^2)
    /*
       - bắt đầu lặp nodeA, sau mỗi lần lăp lại Node a thì ra lặp node B một lần
       - => nếu nodeA == nodeb => giao nhau
     */
    // funtion check xem curA co ở trong nodeB hay không, có => true
    public boolean isCommon(ListNode curA, ListNode headB) {
      while (headB != null){
          if (headB == curA)
              return true;
          headB = headB.next;
      }
      return false;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headA != null){
            if (isCommon(headA, headB)){
               return headA;
            }
            headA = headA.next;
        }
        return null;
    }


    public static void main(String[] args) {

    }
}
