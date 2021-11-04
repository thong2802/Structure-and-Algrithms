package Linked_List;

public class myLinkedList {
   // head of list

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
    //addToIndex
    public static Node addToIndex(Node headNode, int value, int index){
        Node newNode = new Node(value);
        if(index == 0){
          return addToHead(headNode, value);
        }else {
            // tim vi tri can them
            int count = 0;
            Node curNode = headNode;
            while (curNode.next != null){
                count++; //node != 0 => counr ++;
                if (count == index){
                    // thuc hien add
                    newNode.next = curNode.next; // tro vao value cua node sau newNode
                    curNode.next = newNode; // Cur tro vao value cua newNode
                    break;
                }
                curNode = curNode.next;
            }
        }
        return headNode;
    }

    // DeleteHeadNode
    public static Node deleteHeadNode(Node headNode){
        if (headNode != null){
          return headNode.next;
        }
        return headNode;
    }
    // DELETETailNode
    public static Node deleteTailNode(Node headNode){
        if (headNode == null){
            return null;
        }else {
            // xac dinh last node va prev node
            Node lastNode = headNode;
            Node prevNode = null;
            while (lastNode.next != null){// lastNode.next = null;
                prevNode = lastNode;
                lastNode = lastNode.next;
            }
            if (prevNode == null){
                return null;
            }else {
                prevNode.next = null;
            }
        }
        return headNode;
    }
    // deleteIndexNode
    public static Node deleteIndexNode(Node headNode, int index){
       if (headNode == null || index < 0){
           return null;
       }else if (index == 0 ){
            return deleteHeadNode(headNode);
       }else {
            // xac dinh prev node
            // xac dinh cur node
            int count = 0;
            Node cur = headNode;
            Node prev = null;
            boolean bIsFound = false;
            while (cur != null){
                if (index == count){
                  bIsFound = true;
                  break;
                }
                prev = cur;
                cur = cur.next;
                count++;
            }
            // delete cur
            if (bIsFound){
                if (prev == null){ // cur is lastNode
                     return null;
                }else {
                    if (prev != null){
                        prev.next = cur.next;
                    }
                }
            }
        }
        return headNode;
    }

    public static Node removeNthFromEnd(Node head, int n) {
        Node fast = head, slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
       myLinkedList list = new myLinkedList();
       Node head  = new Node(1);
       Node second = new Node(2);
       Node third = new Node(3);
       Node four = new Node(4);
       Node five = new Node(5);


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
        head.next = second;

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
        third.next = four;
       // four.next = five;
        printLinkedList(head);
        removeNthFromEnd(head, 2);
        printLinkedList(head);

//        // addHead
//        Node newList = addToHead(head, 0);
//        printLinkedList(newList);
//        // addTail
//        Node newTail = addToTail(head, 5);
//        printLinkedList(newTail);
//        Node newCur = addToIndex(head, 2, 1);
//        printLinkedList(newCur);
//        Node deleteHeadNode = deleteHeadNode(head);
        //  head = deleteHeadNode(head);
        //  printLinkedList(head);
//          head = deleteTailNode(head);
//          printLinkedList(head);
//         head = deleteIndexNode(head, 0);
//         printLinkedList(head);
//         head = deleteIndexNode(head, 1);
//         printLinkedList(head);



    }
}
