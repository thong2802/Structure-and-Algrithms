package Linked_List;

import java.util.List;

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
    // cach 1
    // solution 1: tạo ra một linkedlist mới, thêm 3 listNode kia vao theo dung thu tu sap xep
    public ListNode addNodeToList(ListNode head, ListNode newNode){


        return null;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode results = null;
        for (int i = 0; i < lists.length; i++) {
            ListNode headNode = lists[i];
            while (headNode != null){
                results = addNodeToList(results,headNode);
                headNode = headNode.next;
            }
        }

       return results;
    }
    public static void main(String[] args) {

    }
}
