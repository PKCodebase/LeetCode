package com.leetcode;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        if(s==null || s.length() == 0){
            return "";
        }
        if(s.length() != indices.length){
            return "";
        }
        char ch[] = new char[s.length()];
        for(int i = 0;i<indices.length;i++){
            int pos = indices[i];
            ch[pos] = s.charAt(i);
        }
        String result = "";
        for(int i=0;i<ch.length;i++){
            result += ch[i];
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "codeleet";
        int indices[] = {4,5,6,7,0,2,1,3};
        ShuffleString shuffleString = new ShuffleString();
        String result = shuffleString.restoreString(s,indices);
        System.out.println(result);
    }
}
