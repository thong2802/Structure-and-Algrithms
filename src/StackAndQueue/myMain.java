package StackAndQueue;

public class myMain {
    public static void main(String[] args) {
//        myArrayStack stack = new myArrayStack(3);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.show();
//
//        stack.pop();
//        stack.show();
        myArrayQueue queue = new myArrayQueue(3);
        queue.push(2);
        queue.push(3);
        queue.push(3);
        queue.show();

         queue.pop();
         queue.show();

    }
}
