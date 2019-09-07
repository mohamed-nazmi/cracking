package Chapter_01;

public class _09 {
    private static boolean isSubstring(String longer, String shorter) {
        return longer.contains(shorter);
    }

    public static boolean isStringRotation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        return isSubstring(s1 + s1, s2);
    }
}