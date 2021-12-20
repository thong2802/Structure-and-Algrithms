package StackAndQueue_07;

import java.util.LinkedList;
import java.util.Queue;

public class _933NumberofRecentCalls {
    private static Queue<Integer> myQueue = new LinkedList<>();

    public static int ping(int t) {
        myQueue.add(t);
        while (myQueue.peek() < (t-3000)){
            myQueue.remove();
        }
        return myQueue.size();
    }

}
