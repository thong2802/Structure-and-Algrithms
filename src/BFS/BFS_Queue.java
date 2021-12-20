package BFS;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS_Queue {
    public static void main(String[] args) {
        int[][] grapth = {   {0,1,0,0,0,0,0},
                {1,0,1,1,1,0,0},
                {0,1,0,0,0,1,0},
                {0,1,0,0,0,1,1},
                {0,1,0,1,0,0,1},
                {0,0,1,1,0,0,0},
                {0,0,0,1,1,0,0}};

        //khai bao
        Queue<Integer> queue = new LinkedList<>();
        // luu cac phan tu da duyet
        Set<Integer> daDuyet = new HashSet<>();
        //Khoi tao
        queue.add(0);
        daDuyet.add(0);

        // duyet theo Queue
        while (queue.isEmpty() == false){
            // pop
            int u = queue.remove();
            // process
            System.out.print(u + " ");
            //tim cac dinh ke v voi u ma chua duoc duyet
            for (int v = 0; v <  grapth.length; v++) {
                if (grapth[u][v] == 1 && daDuyet.contains(v) == false){
                    // add vao queue
                    queue.add(v);
                    // danh giau da duyet
                    daDuyet.add(v);
                }
            }
        }
    }
}
