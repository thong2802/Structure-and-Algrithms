package Linked_List_06;

public class _707DesignLinkedList {
   static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    static class MyLinkedList {
        // head luon tro vao dau list
        Node head;
        /** Initialize your data structure here. */
        public MyLinkedList() {
           head = null;
        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
          Node tempNode = head;
          int count = 0;
          while (tempNode != null){
              if (index == count){
                  return tempNode.value;
              }
              count++;
              tempNode = tempNode.next;
          }
          return -1;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            Node newNode = new Node(val);
            if (head != null){
                newNode.next = head;
                head = newNode;
            }
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            Node newNode = new Node(val);
            Node lastNode = head;
            if (head == null) {
                return;
            } else {
                while (lastNode.next != null) {
                    lastNode = lastNode.next;
                    break;
                }
                lastNode.next = newNode;
            }
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            Node newNode = new Node(val);
            Node cur = head;
            if (index == 0){
                addAtHead(val);
            }else {
            int count = 0;
            while (cur != null){
                count++;
                if (index == count){
                    newNode.next = cur.next;
                    cur.next = newNode;
                    break;
                }
                cur = cur.next;
            }
            }
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            if (index == 0){
                deleteAtIndex(index);
            }
             Node cur = head;
             Node previor = null;
             int count = 0;
             boolean isbFound = false;
             while (cur != null){
                 count ++;
                 if (index == count){
                     isbFound = true;
                     break;
                 }
                 previor = cur;
                 cur = cur.next;
                 if (isbFound){
                     if (previor != null){
                         previor.next = cur.next;
                     }
                 }
             }
        }

        public void printList() {
            System.out.println("List: ");
            Node temp = head;
            if (head == null) {
                System.out.println("Empty");
            } else {
                while (temp != null) {
                    System.out.print(temp.value);
                    temp = temp.next;
                    if (temp != null) {
                        System.out.print("->");
                    } else {
                        System.out.println();
                    }
                }
            }
        }

    }

    /**
     * Your MyLinkedList object will be instantiated and called as such:
     * MyLinkedList obj = new MyLinkedList();
     * int param_1 = obj.get(index);
     * obj.addAtHead(val);
     * obj.addAtTail(val);
     * obj.addAtIndex(index,val);
     * obj.deleteAtIndex(index);
     */
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);  myLinkedList.printList();
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
        myLinkedList.get(1);              // return 2
        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
        myLinkedList.get(1);


    }
}
