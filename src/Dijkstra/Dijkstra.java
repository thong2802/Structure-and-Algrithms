package Dijkstra;

import java.util.HashSet;
import java.util.Set;

public class Dijkstra {
    public static void main(String[] args) {
        // so đỉnh
        int n = 5; // 0-4
        int[][] a = {
                {0,6,0,1,0},
                {6,0,5,2,2},
                {0,5,0,0,5},
                {1,2,0,0,1},
                {0,2,5,1,0}};
        // mảng đã duyệt
        Set<Integer> visited = new HashSet<>();
        // lưu các đỉnh phía trước của nó.
        int[] previous = new int[n];
        // khoảng cách từ đỉnh xuất phát tới đỉnh i
        int[] distance = new int[n];
        // Bước 1: Khởi tạo khoảng cách
        // tới đỉnh xuất phát là 0
        // Tới các đỉnh khác là : dương vô cùng.

        int start = 0;
        int finsh = 4;
        int oo = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            distance[i] = oo;
        }
        // xuat phat tu dinh 0
        distance[start] = 0;

        // lăp lại bươc 2,3,4 cho đến khi không còn đỉnh nào chưa duyệt.
        while (visited.size() < n){
            // bước 2 :
            // chọn đỉnh chưa duyệt và đang có khoảng cách nhỏ nhất (từ đỉnh xuất phát ) làm đỉnh đang xet.
            int dangXet = 0;
            int minDist = oo;
            for (int i = 0; i < n; i++) {
                if (visited.contains(i) == false && distance[i] < minDist){
                    minDist = distance[i];
                    dangXet = i;
                }
            }

            // buoc 3: Từ đỉnh đang xét, duyệt các đỉnh kề chưa duyệt và update khoảng cách và đỉnh trước nó.
            for (int i = 0; i < n; i++) {
                // đỉnh chưa duyệt và tìm các đỉnh kề của nó chưa chuyệt và khác 0.
                if (visited.contains(i) == false &&  a[dangXet][i] != 0){
                    // update khoang cach
                    int newDistance = distance[dangXet] + a[dangXet][i];
                    if (newDistance < distance[i]){
                        distance[i] = newDistance;
                        previous[i] = dangXet;
                    }
                }
            }

            // bước 4: đánh dấu đỉnh đang xét thành đã duyệt.
            visited.add(dangXet);

        }
        System.out.println("Khoảng cách từ " + start + " đến " + finsh + " : " + distance[finsh]);
        // truy vet
        System.out.println("QUANG DUONG DI LA: ");
        int chay = finsh;
        while (chay != start){
            System.out.print(chay + " <- ");
            chay = previous[chay];
        }
        System.out.print(chay);
        System.out.println();
    }
}
