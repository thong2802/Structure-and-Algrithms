package StackAndQueue;

public class _622DesignCircularQueue {
    int[] array;
    int SIZE;
    int tail;
    int head;
    int count;
    _622DesignCircularQueue(int size){
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
       value = array[tail];
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
         _622DesignCircularQueue queue = new _622DesignCircularQueue(3);
        System.out.println(queue.enQueue(1));
        System.out.println(queue.enQueue(2));
        System.out.println(queue.enQueue(3));
        System.out.println(queue.deQueue());
        System.out.println(queue.Front());
        System.out.println(queue.Rear());
        System.out.println(queue.isEmpty());

    }
}
