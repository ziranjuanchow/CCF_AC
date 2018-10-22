package LeetCode;

import java.awt.*;
import java.util.Arrays;

/**
 * Created by liudong on 2018/10/22.
 *Given two strings s and t , write a function to determine if t is an anagram of s.

 Example 1:

 Input: s = "anagram", t = "nagaram"
 Output: true
 Example 2:

 Input: s = "rat", t = "car"
 Output: false
 Note:
 You may assume the string contains only lowercase alphabets.

 Follow up:
 What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);
    }
    public static void main(String[] args){
            String s = "rat";
            String t = "car";
            ValidAnagram_242 v = new ValidAnagram_242();
            boolean result = v.isAnagram(s,t);
            System.out.print(result);
    }
}
