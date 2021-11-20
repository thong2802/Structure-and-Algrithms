package StackAndQueue;

import java.util.ArrayList;

public class myLinkedStack  implements InterfaceStackAndQueue{
    private class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    Node topNode;
    myLinkedStack(){
      topNode = null;
    }


    @Override
    public boolean push(int value) {
        // them mot phan tu vao dau cua linked list
        if (!isFull()){
            Node newNode = new Node(value);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()){
            int value = topNode.value;
            topNode = topNode.next;
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
        return topNode == null;
    }

    @Override
    public void show() {
     if (isEmpty()){
         System.out.println("empty");
         return;
     }
     Node temp = topNode;
     ArrayList<Integer> arrayList = new ArrayList<>();
     while (temp != null){
        // System.out.print(temp.value);
         arrayList.add(temp.value);
         temp = temp.next;
     }
        for (int i = arrayList.size() -1 ; i >= 0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
    }
}
