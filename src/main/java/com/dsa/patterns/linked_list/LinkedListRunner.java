package com.dsa.patterns.linked_list;

public class LinkedListRunner {
    public static void main(String[] args) {
        ListNode third = new ListNode(1);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(2, third);
        ListNode head = new ListNode(1, first);
        System.out.println(PalindromeLinkedList.isPalindrome(head));
    }

}
