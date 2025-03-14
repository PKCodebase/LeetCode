package com.leetcode;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int []freq = new int [26];
        char[] ch = s.toCharArray();
        for(char c:ch){
            freq[c-'a']++;
        }
        for(int i =0 ;i<ch.length;i++){
            if(freq[ch[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "eeltcode";
        FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
        int result = firstUniqueCharacter.firstUniqChar(s);
        System.out.println(result);
    }
}
