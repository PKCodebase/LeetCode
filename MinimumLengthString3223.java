package com.leetcode;

public class MinimumLengthString3223 {
    public int minimumLength(String s) {

        int freq[] = new int[26];
        int n = s.length();
        for(int i =0; i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        int count = 0;
        for(int i =0;i<26;i++){
            if(freq[i]>0){
                if(freq[i]%2==0){
                    count = count + 2;
                }
                else{
                    count = count + 1;
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        MinimumLengthString3223 minimumLengthString3223 = new MinimumLengthString3223();
        String s = "cabaabac";
        int result = minimumLengthString3223.minimumLength(s);
        System.out.println(result);
    }
}
