package Chapter_01;

public class _08 {
    private static void zeroRow(int[][] matrix, int row) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }
    }

    private static void zeroColumn(int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }

    public static void zeroMatrix(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] columns = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                if (matrix[i][j] == 0)
                    rows[i] = columns[j] = true;
        
        for (int i = 0; i < rows.length; i++)
            if (rows[i])
                zeroRow(matrix, i);
        
        for (int j = 0; j < columns.length; j++)
            if (columns[j])
                zeroColumn(matrix, j);
    }
}