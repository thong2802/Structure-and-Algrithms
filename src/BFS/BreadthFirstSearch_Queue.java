package BFS;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BreadthFirstSearch_Queue {
    public static void main(String[] args) {
        int[][] grapth = {   {0,1,0,0,0,0,0},
                            {1,0,1,1,1,0,0},
                            {0,1,0,0,0,1,0},
                            {0,1,0,0,0,1,1},
                            {0,1,0,1,0,0,1},
                            {0,0,1,1,0,0,0},
                            {0,0,0,1,1,0,0}};

        // khai bao
        Queue<Integer> queue = new LinkedList<>();
        // lua cac element da duyet
        Set<Integer> daDuyet = new HashSet<>();

        // khoi tao ban dau
        queue.add(0);
        daDuyet.add(0);

        // duyet qua cac phan tu cua queue
        while (queue.isEmpty() == false){
            int u = queue.remove();
            //proccess
            System.out.print(u + " ");
            //tim cac phan tu v ke voi u chua duyet
            for (int v = 0; v < grapth.length; v++) {
                if (grapth[u][v] == 1 && daDuyet.contains(v) == false){
                    queue.add(v);
                    daDuyet.add(v);
                }
            }
        }
    }
}
