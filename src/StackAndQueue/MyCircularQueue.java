package StackAndQueue;

public class MyCircularQueue {
    int[] array;
    int SIZE;
    int tail;
    int head;
    int count;
    MyCircularQueue(int size){
        SIZE = size;
        array = new int[SIZE];
        tail = head = -1;
        count = 0;
    }
    public boolean enQueue(int value) { // them phan tu
        if (isFull())
            return false;
        tail++;
        if (isEmpty()){
            head = tail;
        }
        if (tail == SIZE){
            tail = 0;
        }
        array[tail] = value;
        count++;
        return true;
    }

    public boolean deQueue() { // lay phan tu ra
        if (isEmpty())
            return false;
        head++;
        if (head == SIZE){
            head = 0;
        }
        count--;
        return true;
    }

    public int Front() { // get head
        return isEmpty() ? -1 : array[head];
    }

    public int Rear() { // get tail
        return isEmpty() ? -1 : array[tail];
    }

    public boolean isEmpty() {
        return count < 0;
    }

    public boolean isFull() {
        return count >= SIZE;
    }
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        System.out.println(myCircularQueue.isEmpty());
        System.out.println(myCircularQueue.isFull());
        System.out.println(myCircularQueue.enQueue(1));
        System.out.println(myCircularQueue.enQueue(2));
        System.out.println(myCircularQueue.enQueue(3));
        System.out.println(myCircularQueue.Front());
        System.out.println(myCircularQueue.Rear());
    }
}
