package Chapter_01;

public class _07 {
    public static boolean rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length)
            return false;
        
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++)
            for (int j = i; j < n - 1 - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
        
        return true;
    }
}