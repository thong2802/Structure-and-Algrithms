package StackAndQueue;

public class testMain {
    public static void main(String[] args) {
        // Stack Array
//        StackArray stack = new StackArray(3);
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.push(1));
//        System.out.println(stack.push(2));
//        System.out.println(stack.push(3));
//        stack.show();
//        System.out.println(stack.isFull());
//        System.out.println(stack.pop());
//        stack.show();
//        System.out.println(stack.isEmpty());


        //  Queue Array
        QueueArray queue = new QueueArray(3);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        System.out.println(queue.push(1));
        System.out.println(queue.push(2));
        System.out.println(queue.push(3));
        System.out.println(queue.push(4));
        System.out.println(queue.count());
        queue.show();
        System.out.println(queue.pop());
        queue.show();

        // Stack - Linked List
/*
        Stack_LiknedList stack_liknedList = new Stack_LiknedList();
        System.out.println(stack_liknedList.isEmpty());
        System.out.println(stack_liknedList.isFull());
        stack_liknedList.show();
        System.out.println(stack_liknedList.push(1));
        System.out.println(stack_liknedList.push(2));
        System.out.println(stack_liknedList.push(3));
        System.out.println(stack_liknedList.push(4));
        stack_liknedList.show();
        System.out.println(stack_liknedList.pop());
        System.out.println(stack_liknedList.pop());
        System.out.println(stack_liknedList.pop());
        System.out.println(stack_liknedList.pop());
        System.out.println(stack_liknedList.pop());
*/

        // Queue - Linked List
   /*     Queue_LinkedList queue_linkedList = new Queue_LinkedList();
        System.out.println(queue_linkedList.isEmpty());
        System.out.println(queue_linkedList.isFull());
        queue_linkedList.show();
        System.out.println(queue_linkedList.push(1));
        System.out.println(queue_linkedList.push(2));
        System.out.println(queue_linkedList.push(3));
        System.out.println(queue_linkedList.push(4));
        queue_linkedList.show();
        System.out.println(queue_linkedList.pop());
        queue_linkedList.show();
        System.out.println(queue_linkedList.pop());
        queue_linkedList.show();
        System.out.println(queue_linkedList.pop());
        queue_linkedList.show();
        System.out.println(queue_linkedList.pop());
        queue_linkedList.show();
         */
   }

}
