package Chapter_01;

public class _03 {
    public static void URLify(char[] str) {
        int lastLetterIdx = str.length - 1;
        while (str[lastLetterIdx] == ' ') {
            lastLetterIdx--;
        }

        int position = str.length - 1;
        for (int i = lastLetterIdx; i >= 0; i--) {
            if (str[i] != ' ') {
                str[position] = str[i];
                position--;
            } else {
                str[position] = '0';
                str[position - 1] = '2';
                str[position - 2] = '%';
                position -= 3;
            }
        }
    }
}