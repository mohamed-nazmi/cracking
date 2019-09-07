package Chapter_01;

public class _05 {
    public static boolean isOneAway(String str1, String str2) {
        if (Math.abs(str1.length() - str2.length()) > 1)
            return false;

        String shorter = str1.length() <= str2.length() ? str1 : str2;
        String longer = str1.length() > str2.length() ? str1 : str2;

        int shortIdx = 0, longIdx = 0;
        boolean oneDiff = false;
        
        while (shortIdx < shorter.length() && longIdx < longer.length()) {
            if (shorter.charAt(shortIdx) != longer.charAt(longIdx)) {
                if (oneDiff)
                    return false;
                oneDiff = true;
                if (shorter.length() == longer.length())
                    shortIdx++;
            } else {
                shortIdx++;
            }
            longIdx++;
        }

        return true;
    }
}