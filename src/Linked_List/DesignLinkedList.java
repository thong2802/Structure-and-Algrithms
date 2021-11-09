package Linked_List;

public class DesignLinkedList {

    public static class Node1 {
        int value;
        Node1 next;
        Node1(int value){
            this.value = value;
            this.next  = null;
        }
    }

    // Print Linked List
    public static void Print(Node1 head){
        if (head == null){
            System.out.println("List empty");
        }else {
            Node1 temp = head;
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

    // addHeadNode
    public static Node1 addHead(Node1 head, int value){
        Node1 newNode = new Node1(value);
        if (head != null){
            newNode.next = head;
        }
        return newNode;
    }

    // addTailNode
    public static Node1 addTailNode(Node1 head, int value){
        Node1 newNode = new Node1(value);
        if (head == null){
           return newNode;
        }else {
            // đi tìm last Node (lastNode.next = null)
            Node1 lastNode = head;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            // tim dc LastNode.next = null
            lastNode.next = newNode;
        }
        return head;
    }

    //addToIndex
    public static Node1 addToIndex(Node1 head, int value, int index){
        Node1 newNode = new Node1(value);
        if (index == 0){
            return addHead(head, value);
        }else {
            // tim vi tri can them
            int count = 0;
            Node1 curNode = head;
           while (curNode.next != null){
               count++; //node != 0 => counr ++;
               if (count == index){
                   // thuc hien add
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
               }
               curNode = curNode.next;
           }
        }
        return head;
    }

    // delete headNode
    public static Node1 removeHeadNode(Node1 head){
        if (head != null) {
            head = head.next;
        }
        return head;
    }

    // deleteTailNode
    public static Node1 removeTailNode(Node1 head){
        if (head == null){
            return null;
        }else {
            Node1 prev = null;
            Node1 last = head;
            while (last.next != null){
                prev = last;
                last = last.next;
            }
            if (prev == null){
                return null;
            }else {
                prev.next = null;
            }
        }
        return head;
    }

    public static Node1 removeIndexNode(Node1 head, int index){
        if (head == null){
            return null;
        }else if (index == 0){
            return removeHeadNode(head);
        } else {
            Node1 prev = null;
            Node1 cur = head;
            while (cur != null){

            }
        }
        return head;
    }



    public static void main(String[] args) {
       Node1 n1 = new Node1(1);
       Node1 n2 = new Node1(2);
       Node1 n3 = new Node1(3);
       Node1 n4 = new Node1(4);
       Node1 n5 = new Node1(5);


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
        n1.next = n2;

         /*  Now next of the first Node refers to the second.  So they
            both are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  | null |     |  3 | null |
        +----+------+     +----+------+     +----+------+ */
        n2.next = n3;// Link second node with the third node
        /*  Now next of the second Node refers to third.  So all three
            nodes are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  |  o-------->|  3 | null |
        +----+------+     +----+------+     +----+------+ */
        n3.next = n4;
        n4.next = n5;
        Print(n1);
        Print(addHead(n1, 3));
        Print(addTailNode(n1, 9));
        Print(addToIndex(n1, 55, 4));
        Print(removeHeadNode(n1));
        Print(removeTailNode(n1));

    }
}
