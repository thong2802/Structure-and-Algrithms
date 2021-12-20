package array_01;

public class _1351CountNegativeNumbersinaSortedMatrix {
    //
    public static int countNegatives(int[][] grid) {
        int count = 0;
        int row = grid.length;
        int colum = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if (grid[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }
    // complexity time 0(N^2)
    // complexity space 0(1)
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},
                        {3,2,1,-1},
                        {1,1,-1,-2},
                        {-1,-1,-2,-3}};

        System.out.println(countNegatives(grid));
    }
}
