package Chapter_01;

import java.util.Hashtable;

public class _04 {
    public static boolean palindromePermutation(String str) {
        int oddValues = 0;
        Hashtable<Character, Integer> chars = new Hashtable<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            Integer num = chars.get(letter);
            if (num == null) {
                chars.put(letter, 1);
                oddValues++;
            } else {
                num++;
                chars.put(letter, num);
                if (num % 2 == 0) {
                    oddValues--;
                } else {
                    oddValues++;
                }
            }
        }

        if (oddValues > 1)
            return false;
        return true;
    }
}