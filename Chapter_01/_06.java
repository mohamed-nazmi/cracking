package Chapter_01;

public class _06 {
    private static int getCompressedLength(String str) {
        int countLength = 0, countConsecutive = 0;

        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;
            if (i + 1 == str.length() || str.charAt(i) != str.charAt(i + 1)) {
                countLength += 1 + String.valueOf(countConsecutive).length();
                countConsecutive = 0;
            }
        }

        return countLength;
    }

    public static String compress(String str) {
        int compressedLength = getCompressedLength(str);
        if (str.length() <= compressedLength)
            return str;
        
        StringBuilder target = new StringBuilder(compressedLength);
        int countConsecutive = 0;

        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;
            if (i + 1 == str.length() || str.charAt(i) != str.charAt(i + 1)) {
                target.append(str.charAt(i));
                target.append(countConsecutive);
                countConsecutive = 0;
            }
        }

        return target.toString();
    }
}