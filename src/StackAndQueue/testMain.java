package StackAndQueue;

public class testMain {
    public static void main(String[] args) {
        Stack_Array stack = new Stack_Array(3);
        System.out.println(stack.isEmpty());
        System.out.println(stack.push(1));
        System.out.println(stack.push(2));
        System.out.println(stack.push(3));
        stack.show();
        System.out.println(stack.isFull());
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.isEmpty());
    }
}
