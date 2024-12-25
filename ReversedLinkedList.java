package com.leetcode;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class ReversedLinkedList {

        public Node reverseList(Node head) {
            if(head == null){
                return head;
            }
            Node previous = null;
            Node currentNode = head;
            Node next = currentNode.next;
            while(currentNode != null){
                currentNode.next = previous;
                previous = currentNode;
                currentNode = next;
                if(next != null){
                    next = currentNode.next;
                }
            }
            head = previous;
            return head;
        }

        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);
            ReversedLinkedList reversedLinkedList = new ReversedLinkedList();
            Node result = reversedLinkedList.reverseList(head);
            while(result != null){
                System.out.println(result.data);
                result = result.next;
            }
    }

}
