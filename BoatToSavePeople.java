package com.leetcode;

import java.util.Arrays;

public class BoatToSavePeople {
        public int numRescueBoats(int[] people, int limit) {
            Arrays.sort(people);
            int start = 0;
            int end = people.length-1;

            int count = 0;
            while(start<=end){
                if(people[start] + people[end] <= limit){
                    start++;
                    end--;
                }else{
                    end--;
                }
                count++;
            }
            return count;
        }
        public static void main(String[] args) {
            int [] people = {3,2,2,1};
            int limit = 3;
            BoatToSavePeople boatToSavePeople = new BoatToSavePeople();
            int result = boatToSavePeople.numRescueBoats(people,limit);
            System.out.println(result);
        }
}
