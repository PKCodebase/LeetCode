package com.leetcode;

public class FindDifference {
    public char findTheDifference(String s, String t) {
        int fsum = 0;
        int ssum = 0;
        for(int i = 0;i<s.length();i++){
            fsum += s.charAt(i);
        }
        for(int i = 0;i<t.length();i++){
            ssum += t.charAt(i);
        }
        int result = ssum - fsum;
        return (char) result;
    }
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        FindDifference findDifference = new FindDifference();
        char result = findDifference.findTheDifference(s,t);
        System.out.println(result);
    }
}
