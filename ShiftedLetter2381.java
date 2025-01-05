package com.leetcode;

public class ShiftedLetter2381 {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int arr[] = new int [n];
        for(int[] shift : shifts){
            if(shift[2] == 1){
                arr[shift[0]]++;
                if(shift[1]+1<n){
                    arr[shift[1]+1]--;
                }
            }
            else{
                arr[shift[0]]--;
                if(shift[1] + 1<n){
                    arr[shift[1] + 1]++;
                }
            }
        }
        StringBuilder result = new StringBuilder(s);
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = (sum+arr[i])%26;
            if(sum<0) sum += 26;
            char shiftedChar = (char) ('a' +
                    ((s.charAt(i) - 'a'+sum)%26));
            result.setCharAt(i,shiftedChar);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        ShiftedLetter2381 shiftedLetter2381 = new ShiftedLetter2381();
        String s = "abc";
        int[][] shifts = {{0,1,0},{1,2,1},{0,2,1}};
        String result = shiftedLetter2381.shiftingLetters(s,shifts);
        System.out.println(result);
    }

}
