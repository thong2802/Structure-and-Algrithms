package Linked_List;

public class _142LinkedListCycleII {
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
         }
      }
    public class Solution {
        /*
-1 : nếu không tạo thành cycle
0 : tạo thành cycle  không trùng với điểm bắt đầu
1 : tạo thành cycle và trung với điểm bắt đầu.
*/
        public int checkNode(ListNode curNode){
            if (curNode == null){
                return -1;
            }
            ListNode slow = curNode;
            ListNode fast = curNode;
            while (slow != null && fast != null && fast.next != null ){
                slow = slow.next;
                fast = fast.next.next;
                if ( fast == slow)
                {
                    if (fast == curNode)
                        return 1;
                    return 0;
                }
            }
            return -1;
        }
        public ListNode detectCycle(ListNode head) {
            ListNode cur = head;
            while (cur != null){
                 int result = checkNode(cur);
                 if (result == -1){
                     return  null;
                 }else if(result == 1){
                     return cur;
                 }else {
                     // xét điểm tiếp theo nếu không trùng với điểm bắt đầu.
                     cur = cur.next;
                 }
            }
           return null;
        }
    }


    public static void main(String[] args) {

    }

}
