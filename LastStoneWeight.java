package com.leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele : stones){
            pq.add(ele);
        }
        while(pq.size()>1){
            int max = pq.remove();
            int smax = pq.remove();

            int nstone = max - smax;

            if(nstone != 0){
                pq.add(nstone);
            }
        }
        if(pq.isEmpty()){
            return 0;
        }else{
            return pq.remove();
        }
    }

    public static void main(String[] args) {
        int stones[] = {2,7,4,1,8,1};
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        int result = lastStoneWeight.lastStoneWeight(stones);
        System.out.println(result);

    }
}
