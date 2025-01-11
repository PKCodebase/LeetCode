package com.leetcode;

public class PalindromeString1400 {
    public boolean canConstruct(String s, int k) {
        int n = s.length();
        if(n<k) return false;
        if(n==k) return true;
        int count[] = new int [26];
        for(int i =0;i<n;i++){
            count[s.charAt(i)-'a']++;
        }
        int c = 0;
        for(int i =0;i<26;i++){
            if(count[i]%2!=0) c++;
        }
        return (c<=k);

    }
    public static void main(String[] args) {
        PalindromeString1400 pl = new PalindromeString1400();
        String s = "leetcode";
        int k = 2;
        boolean result = pl.canConstruct(s,k);
        System.out.println(result);

    }
}
