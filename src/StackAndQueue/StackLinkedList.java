package StackAndQueue;

import java.util.ArrayList;

public class StackLinkedList implements STACK_QUEUE_Interface{
    public static class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    Node topNodex;
    StackLinkedList(){
        topNodex = null;
    }
    @Override
    public boolean push(int value) {
        Node newNode = new Node(value);
        if (!isFull()){
            newNode.next = topNodex;
            topNodex = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()){
            int value = topNodex.value;
            topNodex = topNodex.next;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return topNodex == null;
    }

    @Override
    public void show() {
        if (isEmpty()){
            System.out.println("Empty");
        }
        Node temp = topNodex;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (temp != null) {
           arrayList.add(temp.value);
           temp = temp.next;
        }
        for (int i = arrayList.size()-1; i >=0 ; i--) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
    }
}
