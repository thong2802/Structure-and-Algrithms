package StackAndQueue;

import java.util.ArrayList;

public class Stack_LiknedList implements InterfaceStack_Queue {
    private class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    Node topIndex;
    Stack_LiknedList(){
        topIndex = null;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()){
            Node newNode = new Node(value);
            newNode.next = topIndex;
            topIndex = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()){
            int value = topIndex.value;
            topIndex = topIndex.next;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        // tuy vao chuong trinh cap phat bo nho ma no full
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (topIndex == null) ? true : false;
    }

    @Override
    public void show() {
        if (isEmpty()){
            System.out.println("Empty");
            return;
        }

            Node temp = topIndex;
            ArrayList<Integer> arrayList = new ArrayList<>();
            while (temp != null){
                arrayList.add(temp.value);
                temp = temp.next;
            }

            for (int i = arrayList.size() - 1; i >= 0 ; i--) {
                System.out.print(arrayList.get(i) + " ");
            }
            System.out.println();
     }
 }
