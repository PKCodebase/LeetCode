package com.leetcode;

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        ListNode result = middleOfLinkedList.middleNode(head);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
