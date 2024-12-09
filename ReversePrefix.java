package com.leetcode;

public class ReversePrefix {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        String result = reversePrefix(word,ch);
        System.out.println(result);
    }

    private static String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<word.length();i++){
            sb.append(word.charAt(i));
            if(word.charAt(i) == ch){
                sb.reverse();
                sb.append(word.substring(i+1));
                return sb.toString();
            }
        }
        return word;
    }

}
