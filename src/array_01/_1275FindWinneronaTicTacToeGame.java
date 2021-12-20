package array_01;

public class _1275FindWinneronaTicTacToeGame {
    public String tictactoe(int[][] moves) {
        int[][] array2D = new int[3][3];
        for (int i = 0; i < moves.length; i++) {
            if (i % 2 == 0){
                array2D[moves[i][0]][moves[i][1]] = 'X';
            }else {
                array2D[moves[i][0]][moves[i][1]] = 'O';
            }
        }
        for (int i = 0; i < 3; i++) {
            // check rowm
            if (array2D[i][0] == 'X' && array2D[i][1] == 'X'  &&  array2D[i][2] == 'X' ){
                    return "A";
            }
            if (array2D[i][0] == 'O' && array2D[i][1] == 'O'  &&  array2D[i][2] == 'O' ){
                    return "B";
            }
            // check colum
            if (array2D[0][i] == 'X' && array2D[1][i] == 'X'  &&  array2D[2][i] == 'X' ){
                    return "A";
            }
            if (array2D[0][i] == 'O' && array2D[1][i] == 'O'  &&  array2D[2][i] == 'O' ){
                    return "B";
            }
        }
        //check cheo
        if (array2D[0][0] == 'X' && array2D[1][1] == 'X' && array2D[2][2] == 'X'){
            return "A";
        }
        if (array2D[0][0] == 'O' && array2D[1][1] == 'O' && array2D[2][2] == 'O'){
            return "B";
        }
        if (array2D[0][2] == 'X' && array2D[1][1] == 'X' && array2D[2][0] == 'X'){
            return "A";
        }
        if (array2D[0][2] == 'O' && array2D[1][1] == 'O' && array2D[2][0] == 'O'){
            return "B";
        }

        if (moves.length < 9){
            return "Pending";
        }
        return "Draw";
    }
    public static void main(String[] args) {

    }
}
