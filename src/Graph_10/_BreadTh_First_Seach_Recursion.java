package Graph_10;

import java.util.HashSet;
import java.util.Set;

public class _BreadTh_First_Seach_Recursion {
    public static void BFS(int u, int[][] grapth, Set<Integer> daDuyet){
        //process
        System.out.print(u + " ");
        // tim cac phan tu v ke voi u chua duyet
        for (int v = 0; v < grapth.length; v++) {
            if (grapth[u][v] == 1 && daDuyet.contains(v) == false){
                // da duyet
                daDuyet.add(v);
                BFS(v, grapth, daDuyet);
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

        // Set
        Set<Integer> daDuyet = new HashSet<>();
        //da duyet
        daDuyet.add(0);
        BFS(0, grapth, daDuyet);

    }
}
