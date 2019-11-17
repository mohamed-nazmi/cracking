package Chapter_08;

import java.util.ArrayList;

public class _09 {
    public static ArrayList<String> generateParens(int count) {
        char[] parens = new char[count * 2];
        ArrayList<String> list = new ArrayList<String>();
        generateParens(list, parens, count, count, 0);
        return list;
    }

    private static void generateParens(ArrayList<String> list,
                                       char[] parens,
                                       int leftRemaining,
                                       int rightRemaining,
                                       int index) {

        if (leftRemaining < 0 || leftRemaining > rightRemaining) return;

        if (leftRemaining == 0 && rightRemaining == 0) {
            list.add(String.copyValueOf(parens));
        } else {
            parens[index] = '(';
            generateParens(list, parens, leftRemaining - 1, rightRemaining, index + 1);

            parens[index] = ')';
            generateParens(list, parens, leftRemaining, rightRemaining - 1, index + 1);
        }
    }
}