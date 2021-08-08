package com.company.hacker.rank.interview.preparation.beginner.repeated.string;

public class Result {
    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {

        long count = 0;
        char character = 'a';
        char[] array;
        if (s.length() == n) {
            return getCountOfCharacterInArray(character, s.toCharArray());
        } else if (s.length() > n) {
            return getCountOfCharacterInArray(character, s.substring(0, (int) n).toCharArray());

        } else {
            long multipleOfString = n / s.length();
            long valueOfSubString = n % s.length();

            count = getCountOfCharacterInArray(character, s.toCharArray());
            count = count * multipleOfString;

            for (int i = 0; i < valueOfSubString; i++) {
                if (s.charAt(i) == 'a') {
                    count++;
                }
            }

        }
        return count;
    }

    private static long getCountOfCharacterInArray(char c, char[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) {
                count++;
            }
        }
        return count;
    }
}
