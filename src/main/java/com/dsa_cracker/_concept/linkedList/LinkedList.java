package com.dsa_cracker._concept.linkedList;

public class LinkedList {
    Node head;

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);

        Node second = new Node(2);
        Node third = new Node(3);

        linkedList.head.next = second;
        second.next = third;
        linkedList.printList();
//
//        linkedList.add(4);
//        linkedList.printList();
//        linkedList.insertAfterNode(5, linkedList.head);
//        linkedList.printList();
//        linkedList.append(4);
//        linkedList.printList();
        linkedList.deleteNodeWithValue(5);
        linkedList.printList();
    }

    /**
     * Method to print list
     */
    public void printList(){ //method to print linkedList
        Node node = head;

        if(head == null){
            System.out.println("no node present");
        }
        while(node != null){
            System.out.print(node.data + " ");
            node =  node.next;
        }
        System.out.println();
    }

    /**
     * Method to traverse reverse list
     */
    public void traverseReversedList(){  //TODO

    }
    /**
     * INSERTION
     */
    /**
     * Method 1: To add a node in the front
     * TC: O(1)
     *
     *  1. Initialize new node
     *  2. Change head node
     *  2-a. Point new node's next to head node
     *  2-b. Point head to new node
     *
     *  if( head -> null)
     *      head = newNode
     *  else
     *      newNode.next = head  //Point new node to existing head
     *      head = newNode
     * @param data
     */
    public void add(int data){
        Node newNode = new Node(data); //Initializing
        if( head == null){
            head = newNode;
            return;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    /**
     * Method 2: To add a node after a given node
     * TC: O(1)
     *
     * 1. Initialize node
     * 2. Point newNode's next to previous node's next
     * 3. Point previous node's next to newNode
     *
     * @param data
     * @param node
     */
    public void insertAfterNode(int data, Node node){
        Node newNode = new Node(data);
        if(node == null){
            head = newNode;
            return;
        }
        newNode.next = node.next;
        node.next = newNode;
    }

    /**
     * Method 3: To append a node in the existing linkedList
     * TC: O(N)
     *
     * 1. Initialize a new node
     * 2. Make "next" of new node as null(can be skipped if we initialize next as null in the constructor)
     * 3. If list is empty, initialize head as new node
     * 4. Initialize a lastNode with head
     * 5. Traverse till last node
     * 6. Point next of lastNode to newNode
     *
     */
    public void append(int data){
        Node newNode = new Node(data);
        newNode.next = null;

        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    /**
     * DELETION
     */
    /**
     * Method 1: To delete the first occurrence of given value
     * TC: O(N)
     *
     * 1. Check if list exist
     * 2. Check if the head node has the value
     *      2-a. If yes -> change head
     *
     * 3. Find prev node
     * 4. Change next of prev node
     *
     */
    public void deleteNodeWithValue(int data){
        Node nodeDelete = head, prevNode = null;

        if(nodeDelete == null){  // this checks if list is empty or not
            return;
        }
        if(nodeDelete != null && nodeDelete.data == data){
            head = nodeDelete.next;
            return;
        }

        while(nodeDelete != null && nodeDelete.data != data){
            prevNode = nodeDelete;
            nodeDelete = nodeDelete.next;
        }

        if(nodeDelete == null){  //this prevents null pointer exception is value is not found in the list
            return;
        }

        prevNode.next = nodeDelete.next;
    }
}
