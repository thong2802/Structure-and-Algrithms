package Linked_List;

public class _234PalindromeLinkedList {
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
    //solution :- nếu linked chẵn thì bắt đầu đổi chuyển từ vị trí n/2 +1
    //       - nếu linked lẻ thì đổi chiều từ n/2 + 1
    // viết hàm count đêm số phần tử
    // viết hàm reverseList đổi chiều linked
    public static void printLinkedList(ListNode head){
        if (head == null){
            System.out.println("List is empty");
        }else {
            ListNode temp = head;
            while (temp != null){
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

    public static ListNode reverseList(ListNode head) {
        ListNode curNode = head;
        while (curNode != null && curNode.next != null) {
            ListNode nextNode = curNode.next;
            //
            curNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }
        return head;
    }

    public static int count(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static boolean isPalindrome(ListNode head) {
        int n = count(head);
        int k = n / 2;
        if (n == 1){
            return true;
        }
        // tao bien dem xem index chay toi dau de doi chieu
        int index = 0;
        ListNode curNode = head;
        while (curNode != null){
           if (index == (n % k == 0 ? k :(k+1) )){
               break;
           }
            index ++;
            curNode = curNode.next;
        }
        // dao nguoc tai vi tri curNode
        ListNode the2ndList = reverseList(curNode);
        // so sanh 2 linked xem có giống nhau không.
        // example : 1-2-3-2-1 k-1i, n/2 = 2, k lẻ nên đổi chỗ từ k + 1.
        // => 1-2-3-2-1 là the2ndList
        // tiến hành so sánh listNode ban đầu với the2ndList.
        index = 0;
        while (index < k){
            if (head.val != the2ndList.val){
                return false;
            }
            head = head.next;
            the2ndList = the2ndList.next;
            index ++;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode();
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(2);
        ListNode five = new ListNode(1);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        printLinkedList(one);
        one = reverseList(one);
        printLinkedList(one);
        System.out.println(count(one));

        System.out.println(isPalindrome(one));



    }
}
