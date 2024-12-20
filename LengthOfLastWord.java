package com.leetcode;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        if (words.length == 0) {
            return 0;
        }
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        int result = lengthOfLastWord.lengthOfLastWord(s);
        System.out.println(result);

    }
}
