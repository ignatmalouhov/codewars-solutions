/*
Complete the function scramble(str1, str2) that returns true
if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
Notes:
Only lower case letters will be used (a-z). No punctuation or digits will be included.
Performance needs to be considered
Input strings s1 and s2 are null terminated.
Examples
scramble('rkqodlw', 'world') ==> True
scramble('cedewaraaossoqqyt', 'codewars') ==> True
scramble('katas', 'steak') ==> False
 */

package scramblies;

public class Solution {

    public static boolean scramble(String str1, String str2) {

        if (str1.length() < str2.length()) {
            return false;
        }

        var mutableStr1 = new StringBuilder(str1);
        String[] arrayFromStr2 = str2.split("");

        for (String s : arrayFromStr2) {
            if (mutableStr1.indexOf(s) < 0) {
                return false;
            } else {
                mutableStr1.deleteCharAt(mutableStr1.indexOf(s));
            }
        }
        return true;
    }
}
