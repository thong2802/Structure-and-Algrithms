package Graph;
//solution : tạo một mảng đếm đã duyêt
//          - cho mảng 2 chiều chạy từng hàng và gọi thuật toán DFS
            // -> trả về số lần gọi DFS là số đảo hiện có.

public class _200NumberofIslands {
    // tao Array da duyet
    boolean[][] daDuyet =  new boolean[300][300];
    int soHang;
    int soCot;

    public boolean isValid(int i, int j){
        return i >= 0 && j >= 0 && i < soHang && j < soCot;
    }

    public void DFS(char[][] a, int i, int j){
        // buoc 1: dk dung (bai toan co so)
         if (isValid(i, j) == false) {
             return;
         }
         if (a[i][j] == '0' || daDuyet[i][j] == true) {
             return; // chi quan tam toi 1
         }

        // danh dau da duyet
        daDuyet[i][j] = true;

        // buoc 2: de quy ( cong thuc truy hoi
        DFS(a, i, j+1);
        DFS(a, i, j-1);
        DFS(a, i-1, j);
        DFS(a, i+1, j);
    }
    public  int numIslands(char[][] a) {
        int count = 0;
         soHang = a.length;
         soCot  = a[0].length;
        for (int i = 0; i < soHang ; i++) {
            for (int j = 0; j < soCot; j++) {
                if (a[i][j] == '1' && daDuyet[i][j] == false){
                    DFS(a, i, j);
                    count ++;
                }
            }
        }
       return count;
    }

    public static void main(String[] args) {
        char[][] gird =  { {'1','1','1','1','0'},
                           {'1','1','0','1','0'},
                           {'1','1','0','0','0'},
                           {'0','0','0','0','0'}};



    }
}
