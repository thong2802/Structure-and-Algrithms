package DFS;

import java.util.HashSet;
import java.util.Set;

public class DepthFirstSearch_Recusion {
    public static void DFS(int u, int[][] graph, Set<Integer> daDuyet){
        System.out.print(u + " ");
        // tim cac  dinh ke v voi u chua duoc duyet
        for (int v = 0; v < graph.length; v++) {
            if (graph[u][v] == 1 && daDuyet.contains(v) == false){
                daDuyet.add(v);
                DFS(v, graph, daDuyet);
            }
        }
    }
    public static void main(String[] args) {
        int[][] grapth = {  {0,1,0,0,0,0,0},
                            {1,0,1,1,1,0,0},
                            {0,1,0,0,0,1,0},
                            {0,1,0,0,0,1,1},
                            {0,1,0,1,0,0,1},
                            {0,0,1,1,0,0,0},
                            {0,0,0,1,1,0,0} };
        // da duyet
        Set<Integer> daDuyet = new HashSet<>();
        daDuyet.add(0);
        DFS(0, grapth, daDuyet);
    }

}
