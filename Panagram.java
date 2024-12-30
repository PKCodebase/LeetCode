package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Panagram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for(int i =0;i<sentence.length();i++){
            set.add(sentence.charAt(i));
        }if(set.size()== 26){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        Panagram panagram = new Panagram();
        boolean result = panagram.checkIfPangram(sentence);
        System.out.println(result);
    }

}
