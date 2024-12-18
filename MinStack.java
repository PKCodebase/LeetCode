package com.leetcode;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> st;
    private Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();

    }

    public void push(int val) {
        if(st.size() == 0 || min.peek()>=val){
            min.push(val);
        }
        st.push(val);

    }

    public void pop() {
        int ele1 = st.pop();
        int ele2 = min.peek();

        if(ele1==ele2){
            min.pop();
        }


    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek() ;
    }
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }

}
