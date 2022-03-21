package Linked_List;

public class SingleLinkedList {
    public static class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    // print Liskedlist
    public static void PrintLinkedList(Node head) {
        if (head == null) {
            System.out.println("Linked is EMPTY");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value);
            temp = temp.next;
            if (temp != null) {
                System.out.print("->");
            }else {
                System.out.println();
            }
        }
    }
    // add head
    public static Node addHead(Node head, int value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
        }
        return newNode;
    }
    // add to Index
    public static Node addToIndex(Node head, int value, int index) {
        Node newNode = new Node(value);
        if (index == 0) {
            addHead(head, value);
        } else  {
            int count = 0;
            Node curNode = head;
            while (curNode.next != null){
                count ++;
                if (index == count) {
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }
        return head;
    }
    // add tail
    public static Node addTail(Node head,int value) {
        Node newNode = new Node(value);
        if (head == null) {
            return newNode;
        }else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return head;
    }


    // delete head
    public static Node removeHead(Node head) {
        if (head != null) {
            head = head.next;
        }
        return head;
    }

    // delete to index
    public static Node removeToIndex(Node head, int index) {
        if (index < 0 || head == null) {
            return null;
        } else if (index == 0) {
            return removeHead(head);
        } else {
            int count = 0;
            Node prev = null;
            Node cur = head;
            boolean bIsFound = false;
            while (cur != null) {
                if (index == count) {
                    bIsFound = true;
                    break;
                }
                prev = cur;
                cur = cur.next;
                count++;
            }
            if (bIsFound){
                if (prev == null) {
                    return null;
                }else {
                    if (prev != null) {
                        prev.next = cur.next;
                    }
                }
            }
            return head;
        }
    }
    // delete tail
    public static Node removeTail(Node head) {
        if (head == null) {
            return null;
        }else {
            Node prev = null;
            Node last = head;
            while (last.next != null) {
                prev = last;
                last = last.next;
            }
            if (prev == null) {
                return null;
            }else {
                prev.next = null;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;
        PrintLinkedList(n1);
        PrintLinkedList(addHead(n1, 0));
        PrintLinkedList(addTail(n1, 7));
        PrintLinkedList(addToIndex(n1, 8, 4));
        PrintLinkedList(removeHead(n1));
        PrintLinkedList(removeTail(n1));
        PrintLinkedList(removeToIndex(n1, 4));

    }
}
