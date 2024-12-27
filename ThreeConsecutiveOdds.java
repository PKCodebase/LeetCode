package com.leetcode;

public class ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==1){
                count++;
            }else{
                count = 0;
            }if(count == 3){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ThreeConsecutiveOdds threeConsecutiveOdds = new ThreeConsecutiveOdds();
        int[] arr = {2,6,4,1};
        boolean result = threeConsecutiveOdds.threeConsecutiveOdds(arr);
        System.out.println(result);
    }
}
