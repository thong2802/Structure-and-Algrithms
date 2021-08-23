package StackAndQueue;

public class myArrayStack implements InterfaceStackAndQueue {
    private int[] array;
    private int SIZE;
    private int topIndex ;


    myArrayStack(int size){
      SIZE = size;
      array = new  int[SIZE];
      topIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()){
            topIndex++;
            array[topIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()){
            int value = array[topIndex];
            topIndex--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return topIndex == SIZE-1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }

    @Override
    public void show() {
        if (isEmpty()){
            System.out.println("Stack empty");
        }else {
            for (int i = 0; i <=  topIndex; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

}
