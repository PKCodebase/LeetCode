package com.leetcode;

public class StringSwap1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        int i =0;
        int j = 0;
        int n = s1.length();
        for(int k=0;k<n;k++){
            if(s1.charAt(k)!=s2.charAt(k)){
                count++;
                if(count>2) return false;
                else{
                    if(count==1) i=k;
                    else j = k;
                }
            }
        }
        return (s1.charAt(i) == s2.charAt(j) && s2.charAt(i) == s1.charAt(j));

    }
    public static void main(String[] args) {
        StringSwap1790 stringSwap1790 = new StringSwap1790();
        String s1 = "bank";
        String s2 = "kanb";
        boolean result = stringSwap1790.areAlmostEqual(s1,s2);
        System.out.println(result);
    }
}
