package StackAndQueue;

import Linked_List.myLinkedList;

public class myLinlkedQueue implements InterfaceStackAndQueue{

    private class Node{
       int value;
       Node next;
       Node(int value){
           this.value = value;
       }
    }
    Node head;
    Node tail;
    myLinlkedQueue(){
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
            tail.next=newNode;
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
        }else {
            head =head.next;
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
