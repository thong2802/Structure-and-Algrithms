package Linked_List;

import java.util.List;

public class _141LinkedListCycle {
    class ListNode {
        int value;
        ListNode next;
        ListNode(int value){
            this.value = value;
            next = null;
        }
    }
        public boolean hasCycle(ListNode head) {
            // su dung 2 co tro, 1 con trỏ  trỏ vào đầu,
            // tạo một con trỏ fast nhảy n bước do chúng ta quy định, mỗi bước nhảy
            // thì con trỏ slow nhảy lên một bước, con trỏ fast nhảy n bươc chúng ta quy định, nếu con
            // trỏ fast gặp lisked vòng thì nó sẽ quay vòng và đuổi kịp slow, khi slow == fast => có linked vòng và return true, nếu k return false.
            if (head == null || head.next == null) {
                return false;
            }
            ListNode slow = head;
            ListNode fast = head.next;
            int STEP_MAX = 2;
            while (slow != null) {
                int count = 0;
                while (fast != null) {
                    if (fast == slow) {
                        return true;
                    }
                    fast = fast.next;
                    count ++;
                    if (count == STEP_MAX){
                        break;
                    }
                }
                slow = slow.next;
            }
            return false;
        }

        //
        public boolean hasCycle1(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (slow != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if (fast == slow){
                    return true;
                }
            }
            return false;
        }

    public static void main(String[] args) {

    }
}


