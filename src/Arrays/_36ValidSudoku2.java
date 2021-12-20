package Arrays;

public class _36ValidSudoku2 {
    public boolean isValidSudoku(char[][] a) {
        // check row
        // check colum
        for (int i = 0; i < a.length; i++) {
            if (CheckRow(a, i) == false || CheckColum(a, i) == false) {
                return false;
            }
        }
        // check block
        for (int i = 0; i < 9; i+=3) {
            for (int j = 0; j < 9; j+=3) {
                if (checkBlock(a, i, j) == false) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkBlock(char[][] a, int i0, int j0) {
        boolean[] daxuathien = new boolean[a.length + 1];
        int i_end = i0 + 3;
        int j_end = j0 + 3;
        for (int i = i0; i < i_end; i++) {
            for (int j = j0; j < j_end; j++) {
                char c = a[i][j];
                if (c != '.') {
                    int int_c = (int)c - (int)('0');
                    if (daxuathien[int_c] == true){
                        return false;
                    }
                    daxuathien[int_c] = true;
                }
            }
        }
        return true;
    }

    private boolean CheckColum(char[][] a, int k) {
        boolean[] daxuathien = new boolean[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            // get char j
            char c = a[i][k];
            if (c != '.'){
                int int_c = (int)c - (int)('0');
                if (daxuathien[int_c] == true)
                    return false;
                daxuathien[int_c] = true;
            }
        }
        return true;
    }

    private boolean CheckRow(char[][] a, int k) {
        boolean[] daxuathien = new boolean[a.length + 1];
        for (int j = 0; j < a.length; j++) {
            // get char j
            char c = a[k][j];
            if (c != '.'){
                int int_c = (int)c - (int)('0');
                if (daxuathien[int_c] == true)
                    return false;
                daxuathien[int_c] = true;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
