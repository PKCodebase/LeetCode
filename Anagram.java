package com.leetcode;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int count[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            count[ch - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        Anagram anagram = new Anagram();
        boolean result = anagram.isAnagram(s,t);
        System.out.println(result);
    }
}