package com.leetcode;
import java.util.Arrays;

public class MinimumTimeToRepairCars {
    public static long repairCars(int[] ranks, int cars) { // Renamed to match driver code
        Arrays.sort(ranks);
        long start = 1, end = (long) ranks[0] * cars * cars;

        while (start < end) {
            long mid = start + (end - start) / 2;
            if (canRepair(ranks, cars, mid)) {
                end = mid; // Try to find a smaller valid time
            } else {
                start = mid + 1; // Increase the time
            }
        }
        return start;
    }

    private static boolean canRepair(int[] ranks, int cars, long timeLimit) {
        int repaired = 0;
        for (int rank : ranks) {
            repaired += Math.sqrt(timeLimit / rank); // Cars repaired by this mechanic
            if (repaired >= cars) return true; // Enough cars repaired
        }
        return false;
    }
    public static void main(String[] args) {
        int[] ranks = {4,2,3,1};
        int cars = 10;
        long result = repairCars(ranks, cars);
        System.out.println(result);
    }

}
