package com.leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs==null){
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String [] strs = {"flower","flow","flight"};
        String result = longestCommonPrefix.longestCommonPrefix(strs);
        System.out.println(result);
    }

}
