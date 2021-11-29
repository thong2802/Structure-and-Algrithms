package Linked_List;

public class _1290ConvertBinaryNumberinaLinkedListtoInteger {
    class ListNode {
        int value;
        ListNode next;

        ListNode() {

        }
        ListNode(int value){
            this.value = value;
        }
        ListNode(int value, ListNode next){
            this.value = value;
            this.next = next;
        }
    }
    public static int getDecimalValue(ListNode head) {
            int num = head.value;
            while (head.next != null) {
                num = (num << 1) | head.next.value;
                head = head.next;
            }
            return num;
        }
    public static void main(String[] args) {


    }
}
