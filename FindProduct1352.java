package com.leetcode;

import java.util.ArrayList;

public class FindProduct1352 {
    ArrayList<Integer> list = new ArrayList<>();


    public void ProductOfNumbers() {
        list.clear();

    }

    public void add(int num) {
        if(num==0){
            list.clear();
            return;
        }
        int prev = (list.size()==0)?1:list.get(list.size()-1);
        list.add(prev*num);

    }

    public int getProduct(int k) {
        int s = list.size();
        if(s<k) return 0;
        else if(s==k) return list.get(s-1);
        else  return (list.get(s-1)/list.get(s-1-k));

    }
    public static void main(String[] args) {
        FindProduct1352 findProduct1352 = new FindProduct1352();
        findProduct1352.add(3);
        findProduct1352.add(0);
        findProduct1352.add(2);
        findProduct1352.add(5);
        findProduct1352.add(4);
        int result = findProduct1352.getProduct(2);
        System.out.println(result);
    }


}
