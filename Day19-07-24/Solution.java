import java.util.*;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> res = new ArrayList<>();

        int small = matrix[0][0];
        int idx_i = 0, idx_j = 0;
        for(int i = 0; i < n; i++) {
            small = matrix[i][0];
            idx_i = i;
            for(int j = 0; j < m; j++){
                if(matrix[i][j] <= small) {
                    small = matrix[i][j];
                    idx_i = i;
                    idx_j = j;
                }
            }
            int result =  maxInColumn(small, idx_i, idx_j, matrix, n);
            if(result != 0) res.add(result);
        }

        return res;
    }

    private int maxInColumn(int small, int i, int j, int[][] matrix, int n) {
        int idx_i = i + 1;
        // System.out.println( i + " " + j);
        while(idx_i < n){
            if(matrix[idx_i][j] > small) return 0;
            else if (matrix[idx_i][j] <= small)   idx_i++;
        }
        i--;

        while(i >= 0){
            if(matrix[i][j] > small) return 0;
            else if (matrix[i][j] <= small)    i--;
        }

        return small;
    }
}