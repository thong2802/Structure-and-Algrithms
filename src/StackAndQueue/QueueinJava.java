package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueinJava {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        for (Integer queues: queue) {
            System.out.print(queues + " ");
        }
        System.out.println();
        queue.remove();
        for (Integer queues: queue) {
            System.out.print(queues + " ");
        }
        System.out.println();
    }
}
