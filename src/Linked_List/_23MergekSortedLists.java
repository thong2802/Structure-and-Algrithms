package Linked_List;

public class _23MergekSortedLists {
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
    // cach 1: 0(n^2)
    // solution 1: tạo ra một linkedlist mới, thêm 3 listNode kia vao theo dung thu tu sap xep
    public static ListNode addNodeToList(ListNode head, ListNode newNode){
        newNode.next = null;
       if (head == null){
           return newNode;
       }
       ListNode preNode = null;
       ListNode curNode = head;
       // dung lai khi newNode.val <= curNode
        while (curNode != null && newNode.val > curNode.val){
            preNode = curNode;
            curNode = curNode.next;
        }

        // add newNode to head
        if (preNode == null){
            newNode.next = curNode;
            head = newNode;
        }else {
            // add newNode to tail
            if (curNode == null){
                preNode.next = newNode;
            }else { // add vao giua
                newNode.next = curNode;
                preNode.next = newNode;
            }
        }
        return head;
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode results = null;
        for (int i = 0; i < lists.length; i++) {
            ListNode headNode = lists[i];
            ListNode nextNode = null;
            while (headNode != null){
                nextNode = headNode.next;
                results = addNodeToList(results,headNode);
                headNode = nextNode;
            }
        }
       return results;
    }
    public static void main(String[] args) {

    }
}
