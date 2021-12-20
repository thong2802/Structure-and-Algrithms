package DFS;

import java.util.HashSet;
import java.util.Set;

public class DFS_Recursion {
    public static void DSF (int u, int[][] grapth, Set<Integer> daDuyet){
        // process
        System.out.print(u + " ");
        for (int v = 0; v <  grapth.length; v++) {
            if (grapth[u][v] == 1 && daDuyet.contains(v) == false){
                daDuyet.add(v);
                DSF(v, grapth, daDuyet);
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

        //
        Set<Integer> daDuyet = new HashSet<>();
        daDuyet.add(0);
        DSF(0, grapth, daDuyet);
    }
}
