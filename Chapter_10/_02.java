package Chapter_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Set;

public class _02 {
    private static String sortChars(String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    public static void sortArray(String[] strings) {
        Hashtable<String, ArrayList<String>> hashtable = new Hashtable<String, ArrayList<String>>();
        for (String string : strings) {
            String sortedChars = sortChars(string);
            ArrayList<String> list;
            if (!hashtable.containsKey(sortedChars)) {
                list = new ArrayList<String>();
            } else {
                list = hashtable.get(sortedChars);
            }
            list.add(string);
            hashtable.put(sortedChars, list);
        }

        int index = 0;
        Set<String> keys = hashtable.keySet();
        for (String key : keys) {
            ArrayList<String> list = hashtable.get(key);
            for (String string : list) {
                strings[index] = string;
                index++;
            }
        }
    }
}