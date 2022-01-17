package Graph;

public class _200NumberofIslands_BFS {
    boolean[][] daDuyet = new boolean[300][300];
    int soHang;
    int soCot;
    public boolean isVailid(int i, int j){
        return i >= 0 && j >= 0 && i <= soHang && j <= soCot;
    }
    public void BFS(char[][] a, int i, int j){
       // dk dung
        if (isVailid(i, j) == false){
            return;
        }
        if (a[i][j] == '0' || daDuyet[i][j] == true){
            return;
        }
        // danh dau da duyet
         daDuyet[i][j] = true;
        // buoc 2 duyet
        BFS(a, i, j + 1);
        BFS(a, i,  j -1);
        BFS(a, i-1,  j );
        BFS(a, i+1,  j );
    }
    public  int numIslands(char[][] a) {
     soHang = a.length;
     soCot = a[0].length;
     int count = 0;
        for (int i = 0; i <  soHang; i++) {
            for (int j = 0; j <  soCot; j++) {
                if (a[i][j] == '1' && daDuyet[i][j] == false){
                    BFS(a, i, j);
                    count ++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
