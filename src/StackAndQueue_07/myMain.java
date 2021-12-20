package StackAndQueue_07;

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
//        myArrayQueue queue = new myArrayQueue(3);
//        queue.push(2);
//        queue.push(3);
//        queue.push(3);
//        queue.show();
//
//         queue.pop();
//         queue.show();

//        myLinkedStack linkedStack = new myLinkedStack();
//        linkedStack.push(1);
//        linkedStack.push(2);
//        linkedStack.push(3);
//        linkedStack.push(4);
//        linkedStack.push(5);
//        linkedStack.show();
//
//        System.out.println(linkedStack.pop());
//        linkedStack.show();
//        System.out.println(linkedStack.isEmpty());
//        System.out.println(linkedStack.isFull());

        myLinlkedQueue linlkedQueue = new myLinlkedQueue();

        System.out.println(linlkedQueue.push(4));
        System.out.println(linlkedQueue.push(5));
        System.out.println(linlkedQueue.push(6));

        linlkedQueue.show();
        linlkedQueue.pop();
        linlkedQueue.show();





    }
}
