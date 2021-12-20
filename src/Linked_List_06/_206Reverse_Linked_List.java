package Linked_List_06;

public class _206Reverse_Linked_List {
    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public static void printNode(Node head){
        if (head == null){
            System.out.println("Empty");
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
    // dung vong for
    public static Node reverseList(Node head){
        Node cur = head;
        if (head == null){
            return null;
        }else {
            // xac dinh CurNode
            // xac dinh nextNode
            // curNode == head
            while (cur != null &&cur.next != null){
                Node next = cur.next;
                // thoat toan
                cur.next = next.next;
                next.next = head;
                head = next;
            }
        }
        return head;
    }
    // su dung de quy
    public static Node reverseList1(Node head){
    // BTCS
        if (head == null)
            return null;

        Node nextHead = head.next;
        //TH 1 Node
        if (nextHead == null)
            return head;

        // TH TQ
        Node newNode = reverseList1(nextHead);
        nextHead.next = head;
        head.next = null;

        return newNode;
    }

    public static void main(String[] args) {
      _206Reverse_Linked_List list = new _206Reverse_Linked_List();
      Node n1 = new Node(1);
      Node n2 = new Node(2);
      Node n3 = new Node(3);
      Node n4 = new Node(4);
      Node n5 = new Node(5);

      n1.next = n2;
      n2.next = n3;
      n3.next = n4;
      n4.next = n5;

      printNode(n1);
      n1 = reverseList1(n1);
      printNode(n1);
    }
}
