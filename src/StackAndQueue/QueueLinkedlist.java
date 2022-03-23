package StackAndQueue;

public class QueueLinkedlist implements STACK_QUEUE_Interface{
    public static class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    Node head;
    Node tail;
    public QueueLinkedlist() {
        head = null;
        tail = null;
    }
    @Override
    public boolean push(int value) {
        if (!isFull()){
            Node newNode = new Node(value);
            if (isEmpty()){
                head = tail = newNode;
            }else {
                tail.next = newNode;
                tail = newNode;
            }
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
           return -1;
        }
        int value = tail.value;
        if (head == tail) {
            head = tail = null;
        }else {
            head = head.next;
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (head == null && tail == null);
    }

    @Override
    public void show() {
        if (isEmpty()){
            System.out.print("emtpy");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
