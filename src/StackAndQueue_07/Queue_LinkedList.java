package StackAndQueue_07;

public class Queue_LinkedList implements InterfaceStack_Queue{
    private class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    Node head;
    Node tail;
    Queue_LinkedList(){
        head = tail = null;
    }

    @Override
    public boolean push(int value) {
        if (isFull()){
            return false;
        }
        Node newNode = new Node(value);
        if (isEmpty()){
            head = tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        return true;
    }

    @Override
    public int pop() {
        if (isEmpty()){
            return -1;
        }
        int value = head.value;
        if (head == tail){
            head = tail = null;
        }
        head = head.next;
        return value;
    }

    @Override
    public boolean isFull() {
        return true;
    }

    @Override
    public boolean isEmpty() {
        return (head == null && tail == null) ? true : false;
    }

    @Override
    public void show() {
        if (isEmpty()){
            System.out.println("Empty");
        }else{
            Node temp = head;
            while (temp != null){
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
