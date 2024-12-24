package com.leetcode;
class ListNode {

    int val;
    ListNode next;
    ListNode() {

    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class DeleteDuplicateLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;
        while(currentNode != null && currentNode.next != null){
            if(currentNode.val == currentNode.next.val){
                currentNode.next = currentNode.next.next;
            }else{
                currentNode = currentNode.next;
            }
        }
       return  head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        DeleteDuplicateLinkedList deleteDuplicateLinkedList = new DeleteDuplicateLinkedList();
        ListNode result = deleteDuplicateLinkedList.deleteDuplicates(head);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
