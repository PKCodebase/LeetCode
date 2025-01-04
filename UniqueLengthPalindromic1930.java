package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueLengthPalindromic1930 {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> firstOcc = new HashMap<>();
        HashMap<Character,Integer> lastOcc = new HashMap<>();
        int n = s.length();
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            if(!firstOcc.containsKey(ch)){
                firstOcc.put(ch,i);
            }
            lastOcc.put(ch,i);
        }
        int count = 0;
        for(char ch : firstOcc.keySet()){
            int first = firstOcc.get(ch);
            int last = lastOcc.get(ch);
            if(first == last) continue;
            HashSet<Character> set1 = new HashSet<>();
            for(int i=first+1;i<last;i++){
                set1.add(s.charAt(i));
            }
            count += set1.size();
        }
        return count;

    }
    public static void main(String[] args) {
        String s = "aabca";
        UniqueLengthPalindromic1930 uniqueLengthPalindromic1930 = new UniqueLengthPalindromic1930();
        int result = uniqueLengthPalindromic1930.countPalindromicSubsequence(s);
        System.out.println(result);
    }
}
