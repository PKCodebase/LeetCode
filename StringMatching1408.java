package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class StringMatching1408 {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        int n = words.length;
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i==j)continue;
                if(words[j].contains(words[i])){
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        StringMatching1408 stringMatching1408 = new StringMatching1408();
        String[] words = {"mass","as","hero","superhero"};
        List<String> result = stringMatching1408.stringMatching(words);
        System.out.println(result);
    }
}
