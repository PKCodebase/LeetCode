package com.leetcode;

public class ReverseWord {

    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i>=0; i--) {
            sb.append(words[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";
        ReverseWord reverseWord = new ReverseWord();
        String result = reverseWord.reverseWords(s);
        System.out.println(result);
    }
}
