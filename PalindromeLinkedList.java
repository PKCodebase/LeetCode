package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while(current != null){
            list.add(current.val);
            current = current.next;
        }
        int left = 0;
        int right = list.size()-1;
        while(left<right){
            if(list.get(left) != list.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        boolean result = palindromeLinkedList.isPalindrome(head);
        System.out.println(result);
    }
}
