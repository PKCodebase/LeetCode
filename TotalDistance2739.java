package com.leetcode;

public class TotalDistance2739 {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int maxDistance = 0;
        while(mainTank >= 5 && additionalTank>0){
            maxDistance += 50;
            mainTank = (mainTank-5)+1;
            additionalTank--;
        }
        maxDistance += mainTank * 10;
        return maxDistance;
    }
    public static void main(String[] args) {
        TotalDistance2739 totalDistance2739 = new TotalDistance2739();
        int mainTank = 9;
        int additionalTank = 2;
        int result = totalDistance2739.distanceTraveled(mainTank,additionalTank);
        System.out.println(result);
    }
}
