package com.leetcode;

public class CountPrefix {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String check:words){
            if(check.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        int result = new CountPrefix().prefixCount(words,pref);
        System.out.println(result);
    }
}
