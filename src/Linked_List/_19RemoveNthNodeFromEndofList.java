package Linked_List;

import java.util.List;

public class _19RemoveNthNodeFromEndofList {
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
    // 1,2,3,4,5
   // solution : cho con trỏ fast chạy tới n = 2. => fast có value = 3, và slow có value = 1.
    // tức là cho fast chạy trước cách slow n bước,
    // hết vòng lặp nếu fast trỏ tới null thì tức là list có 2 phần tử và return head.next
    // nếu không cho vòng lặp fast!=null và cho fast và slow nhảy từng bước đến khi fast == null => slow đang trỏ tới node cần xoá và cho slow = slow.next.next

    public  static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null){
            return null;
        }else {
          ListNode fast = head;
          ListNode slow = head;
            for (int i = 0; i < n; i++) {
                 fast = fast.next;
            }

            if (fast == null){ // chứng tỏ mảng có 2 phần tử và fast đang trỏ tới null. head chính là phần tử cần xoá
                return head.next;
            }
            // lặp tới khi fast null
            while (fast.next !=null){
                fast = fast.next;
                slow = slow.next;
            }
            // tim duoc slow tro toi phan tu can xoas
            slow = slow.next.next;

        }
        return head;
    }
    public static void main(String[] args) {
    }
}
