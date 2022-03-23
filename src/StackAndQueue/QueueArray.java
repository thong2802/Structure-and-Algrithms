package StackAndQueue;

public class QueueArray implements STACK_QUEUE_Interface{
    private int[] array;
    private int SIZE;
    private int headIndex;
    private int tailIndex;

    public QueueArray(int size) {
        SIZE = size;
        array = new int[SIZE];
        headIndex = tailIndex = -1;
    }
    @Override
    public boolean push(int value) {
        if (!isFull()){
            if (isEmpty()){
                // if empty => insert the first => head == tail
                headIndex++;
            }
            tailIndex++;
            array[tailIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if (!isEmpty()){
            value = array[headIndex];
            headIndex++;
            if (headIndex > tailIndex) {
                headIndex = tailIndex = -1;
            }
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return tailIndex == SIZE-1;
    }

    @Override
    public boolean isEmpty() {
        return (headIndex == -1 && tailIndex == -1);
    }
    public int count() {
        if (isEmpty()) {
            return -1;
        }
        return (tailIndex-headIndex)+1;
    }
    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }else {
            for (int i = headIndex; i <= tailIndex; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
