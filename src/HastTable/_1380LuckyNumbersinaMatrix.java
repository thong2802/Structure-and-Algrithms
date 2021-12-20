package HastTable;

import java.util.*;

public class _1380LuckyNumbersinaMatrix {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        int row = matrix.length;
        int colum = matrix[0].length;

        // find minRow
        for (int i = 0; i < row; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < colum; j++) {
                if (matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
            countMap.put(min, countMap.getOrDefault(min, 0)+1);
        }

        // find maxColum
        for (int i = 0; i < colum; i++) {
            int max = matrix[0][i];
            for (int j = 1; j < row; j++) {
                if (matrix[j][i] > max){
                    max = matrix[j][i];
                }
            }
            countMap.put(max, countMap.getOrDefault(max, 0)+1);
        }

        for (Integer key : countMap.keySet()) {
            Integer value = countMap.get(key);
            if (value == 2) {
                result.add(key);
            }
        }
        return result;
    }

    // complexity time 0(row * colum)
    // complexity space 0(row * colum)
    public static void main(String[] args) {
        int[][]  matrix = {{ 3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }
}
