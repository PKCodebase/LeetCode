package com.leetcode;

public class SplitString {
        public int balancedStringSplit(String s) {
            if(s==null || s.length()==0){
                return 0;
            }
            int left =0;
            int right = 0;
            int count = 0;
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(ch=='L'){
                    left++;
                }else{
                    right++;
                }
                if(left == right){
                    count++;
                }
            }
            return count;
        }
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        SplitString splitString = new SplitString();
        int result = splitString.balancedStringSplit(s);
        System.out.println(result);
    }
}
