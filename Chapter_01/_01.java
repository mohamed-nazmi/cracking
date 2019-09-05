package Chapter_01;

public class _01 {
    public static boolean isUnique(String str) {
        if (str.length() > 128)
            return false;
        
        boolean[] chars = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (chars[val])
                return false;
            chars[val] = true;
        }
        
        return true;
    }
}