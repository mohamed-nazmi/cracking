package Chapter_08;

enum Color { Red, Blue, Green, Yellow, Black, White }

public class _10 {
    public static boolean paintFill(Color[][] screen, int r, int c, Color target) {
        if (screen[r][c] == target)
            return false;
        return paintFill(screen, r, c, screen[r][c], target);
    }

    private static boolean paintFill(Color[][] screen, int r, int c, Color current, Color target) {
        if (r < 0 || r >= screen.length || c < 0 || c > screen[0].length)
            return false;

        if (screen[r][c] == current) {
            screen[r][c] = target;
            paintFill(screen, r - 1, c, current, target);
            paintFill(screen, r + 1, c, current, target);
            paintFill(screen, r, c - 1, current, target);
            paintFill(screen, r, c + 1, current, target);
        }

        return true;
    }
}