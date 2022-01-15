package BFS;

import java.util.HashSet;
import java.util.Set;

public class BreadthFirstSearch_recusion {
    public static void BSF(int u, int[][] graph, Set<Integer> daDuyet){
        System.out.print(u + " ");
        for (int v = 0; v < graph.length; v++) {
            if (graph[u][v] == 1 && daDuyet.contains(v) == false){
                daDuyet.add(v);
                BSF(v, graph, daDuyet);
            }
        }
    }
    public static void main(String[] args) {
        int[][] grapth = {   {0,1,0,0,0,0,0},
                {1,0,1,1,1,0,0},
                {0,1,0,0,0,1,0},
                {0,1,0,0,0,1,1},
                {0,1,0,1,0,0,1},
                {0,0,1,1,0,0,0},
                {0,0,0,1,1,0,0}};

        // luu cac phan tu da duyet
        Set<Integer> daDuyet = new HashSet<>();
        daDuyet.add(0);
        BSF(0, grapth, daDuyet);
    }
}
