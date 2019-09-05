package Chapter_01;

import java.util.Hashtable;

public class _02 {
    public static boolean checkPermutation(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        
        Hashtable<Character, Integer> chars = new Hashtable<Character, Integer>();
        for (int i = 0; i < str1.length(); i++) {
            char letter = str1.charAt(i);
            Integer num = chars.get(letter);
            if (num != null) {
                chars.put(letter, num + 1);
            } else {
                chars.put(letter, 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            char letter = str2.charAt(i);
            Integer num = chars.get(letter);
            if (num == null || num == 0)
                return false;
            chars.put(letter, num - 1);
        }

        return true;
    }
}