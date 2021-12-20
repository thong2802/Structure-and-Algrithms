package DFS;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFS_Stack {
    public static void main(String[] args) {
        int[][] grapth = {   {0,1,0,0,0,0,0},
                {1,0,1,1,1,0,0},
                {0,1,0,0,0,1,0},
                {0,1,0,0,0,1,1},
                {0,1,0,1,0,0,1},
                {0,0,1,1,0,0,0},
                {0,0,0,1,1,0,0}};
        // khai bao
        Stack<Integer> stack = new Stack<>();
        // luu cac phan tu da duyet
        Set<Integer> daDuyet  = new HashSet<>();
        // khoi tao
        stack.add(0);
        daDuyet.add(0);

        // duyet theo stack
        while (stack.isEmpty() == false){
            int u = stack.pop();
            // process
            System.out.print(u + " ");
            // add tat cac dinh ke v voi u ma chua duoc duyet vao stack
            for (int v = 0; v <  grapth.length; v++) {
                if (grapth[u][v] == 1 && daDuyet.contains(v) == false){
                    stack.add(v);
                    // danh dau da duyet v
                    daDuyet.add(v);
                }
            }
        }

    }
}
