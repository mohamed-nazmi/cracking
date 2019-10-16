package Chapter_08;

import java.util.ArrayList;
import java.util.HashSet;

public class _02 {
    public static ArrayList<Point> getPath(boolean[][] matrix) {
        if (matrix == null || matrix.length == 0) return null;
        ArrayList<Point> path = new ArrayList<Point>();
        HashSet<Point> failedPoints = new HashSet<Point>();
        if (getPath(matrix, matrix.length - 1, matrix[0].length - 1, path, failedPoints))
            return path;
        return null;
    }

    private static boolean getPath(boolean[][] matrix, int rowIdx, int colIdx, ArrayList<Point> path, HashSet<Point> failedPoints) {
        if (rowIdx < 0 || colIdx < 0 || !matrix[rowIdx][colIdx])
            return false;

        Point p = new Point(rowIdx, colIdx);
        if (failedPoints.contains(p))
            return false;

        if (
            (rowIdx == 0 && colIdx == 0) ||
            getPath(matrix, rowIdx - 1, colIdx, path, failedPoints) ||
            getPath(matrix, rowIdx, colIdx - 1, path, failedPoints)
        ) {
            path.add(p);
            return true;
        }

        failedPoints.add(p);
        return false;
    }
}

class Point {
    int row, column;

    public Point(int r, int c) {
        row = r;
        column = c;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point))
            return false;

        Point p = (Point) obj;
        return row == p.row && column == p.column;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(String.valueOf(row) + String.valueOf(column));
    }

    @Override
    public String toString() {
        return "(" + row + ", " + column + ")";
    }
}