package com.leetcode;

public class FirstDuplicate2351 {
    public char repeatedCharacter(String s) {
        int n = s.length();
        String ch = "";
        int arr[] = new int[26];
        for(int i=0;i<n;i++){
            arr[s.charAt(i) - 97]++;
            if(arr[s.charAt(i)-97] == 2){
                ch = String.valueOf(s.charAt(i));
                break;
            }
        }
        return ch.charAt(0);

    }
    public static void main(String[] args) {
        FirstDuplicate2351 firstDuplicate2351 = new FirstDuplicate2351();
        String s = "abccbaacz";
        char result = firstDuplicate2351.repeatedCharacter(s);
        System.out.println(result);
    }
}
