package Linked_List;

public class myLinkedList {
   // head of list
    Node head;
    public static class Node{
        int value;
        Node next;
        // Constructor
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }
    public static void printLinkedList(Node head){
      if (head == null){
          System.out.println("List is empty");
      }else {
          Node temp = head;
          while (temp != null){
              System.out.print(temp.value);
              temp = temp.next;
              if (temp != null){
                  System.out.print("->");
              }else {
                  System.out.println();
              }
          }
      }
    }
    // addHeadNode
    public static Node addToHead(Node headNode, int value){
         Node newNode = new Node(value);
         if (headNode != null){
             newNode.next = headNode;
         }
         return newNode;
    }
    // addTail
    public static Node addToTail(Node headNode, int value){
        Node newNode = new Node(value);
        if (headNode == null){
            return newNode;
        }else {
            // đi tìm last Node (lastNode.next = null)
            Node lastNode = headNode;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            // gánt  lastNode = newNode;
            lastNode.next = newNode;
        }
        return headNode;

    }

    public static void main(String[] args) {
       myLinkedList list = new myLinkedList();
       list.head  = new Node(1);
       Node second = new Node(2);
       Node third = new Node(3);


        /* Three nodes have been allocated dynamically.
          We have references to these three blocks as head,
          second and third

          llist.head        second              third
             |                |                  |
             |                |                  |
         +----+------+     +----+------+     +----+------+
         | 1  | null |     | 2  | null |     |  3 | null |
         +----+------+     +----+------+     +----+------+ */

        // Link first node with the second node
        list.head.next = second;
         /*  Now next of the first Node refers to the second.  So they
            both are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  | null |     |  3 | null |
        +----+------+     +----+------+     +----+------+ */
        second.next = third;// Link second node with the third node
        /*  Now next of the second Node refers to third.  So all three
            nodes are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  |  o-------->|  3 | null |
        +----+------+     +----+------+     +----+------+ */
        printLinkedList(list.head);

        // addHead
        Node newList = addToHead(list.head, 0);
        printLinkedList(newList);
        // addTail
        Node newTail = addToTail(list.head, 4);
        printLinkedList(newTail);


    }
}
