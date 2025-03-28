package com.leetcode;

import java.util.Arrays;

public class CheckGrid_3394 {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        int length = rectangles.length;
        Arrays.sort(rectangles,(a,b)->Integer.compare(a[0],b[0]));
        int maxEnd = rectangles[0][2];
        int count = 0;
        for(int i=1;i<length;i++){
            if(rectangles[i][0]>=maxEnd ){
                count++;
            }
            maxEnd = Math.max(maxEnd,rectangles[i][2]);
        }
        if(count>=2){
            return true;
        }
        Arrays.sort(rectangles,(a,b)->Integer.compare(a[1],b[1]));
        maxEnd = rectangles[0][3];
        count = 0;
        for(int i=1;i<length;i++){
            if(rectangles[i][1]>=maxEnd ){
                count++;
            }
            maxEnd = Math.max(maxEnd,rectangles[i][3]);
        }
        if(count >=2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 3;
        int[][] rectangles = {{1,7},{2,6},{8,10}};
        CheckGrid_3394 checkGrid_3394 = new CheckGrid_3394();
        boolean result = checkGrid_3394.checkValidCuts(n,rectangles);
        System.out.println(result);
    }
}
