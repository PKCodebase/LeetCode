package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int freq[] = new int[26];
        for(String word : words2){
            int temp[] = getFreq(word);
            for(int i =0; i<26;i++){
                freq[i] = Math.max(freq[i],temp[i]);
            }
        }
        List<String> res = new ArrayList<>();
        for(String word : words1){
            int temp[] = getFreq(word);
            boolean flag = true;
            for(int i =0;i<26;i++){
                if(freq[i] > temp[i]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                res.add(word);
            }
        }
        return res;
    }
    public int[] getFreq(String word){
        int freq[] = new int[26];
        for(int i =0;i<word.length();i++){
            freq[word.charAt(i)-'a']++;
        }
        return freq;
    }
    public static void main(String[] args) {
        WordSubsets wordSubsets = new WordSubsets();
        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"e","o"};
        List<String> result = wordSubsets.wordSubsets(words1,words2);
        System.out.println(result);
    }
}
