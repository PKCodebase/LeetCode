package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharacterAccourance1941 {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        Set<Integer> set = new HashSet<Integer>(map.values());
        if(set.size() == 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abacbc";
        CharacterAccourance1941 characterAccourance1941 = new CharacterAccourance1941();
        boolean result = characterAccourance1941.areOccurrencesEqual(s);
        System.out.println(result);
    }
}
