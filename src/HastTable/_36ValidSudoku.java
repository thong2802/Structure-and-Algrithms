package HastTable;

public class _36ValidSudoku {
    //check row
    public boolean checkRow(char[][] a, int k){
        boolean[] daxuathien = new boolean[a.length +1];
        for (int j = 0; j < a.length; j++) {
            char c = a[k][j];
            if (c != '.'){
                int c_int = (int)c - (int)('0');
                if (daxuathien[c_int] == true){
                    return false;
                }
                daxuathien[c_int] = true;
            }
        }
        return true;
    }
    //checkcolumn
    public boolean checkColumn(char[][] a, int k){
        boolean[] daxuathien = new boolean[a.length +1];
        for (int i = 0; i < a.length; i++) {
            char c = a[i][k];
            if (c != '.'){
                int c_int = (int)c - (int)('0');
                if (daxuathien[c_int] == true){
                    return false;
                }
                daxuathien[c_int] = true;
            }
        }
        return true;
    }
    //check block
    public boolean checkBlock(char[][] a, int i0, int j0){
        boolean[] daxuathien = new boolean[a.length +1];
        int i_end = i0 + 3;
        int j_end = j0 + 3;
        for (int i = i0; i < i_end; i++) {
            for (int j = j0; j < j_end ; j++) {
                char c = a[i][j];
                if (c != '.'){
                    int c_int = (int)c - (int)('0');
                    if (daxuathien[c_int] == true){
                        return false;
                    }
                    daxuathien[c_int] = true;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] a) {
        // kiem tra cac hang
        // kiem tra cac cot
        for (int i = 0; i < a.length; i++) {
            if (checkRow(a, i) == false || checkColumn(a, i) == false){
                return false;
            }
        }
        // kiem tra cac block 3*3
        for (int i = 0; i < 9; i+=3) {
            for (int j = 0; j < 9; j+=3) {
               if (checkBlock(a, i, j) == false){
                   return false;
               }
            }
        }
       return true;
    }
    public static void main(String[] args) {
        char c = '3';
        int c_int = (int)c - (int)'0';
        System.out.println(c_int);
    }
}
