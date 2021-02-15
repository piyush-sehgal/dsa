package com.dsa_cracker._concept.binaryTree;

/**
 * In-order => (Left, Root, Right)
 * Pre-order => (Root, Left, Right)
 * Post-order => (Left, Right, Root)
 */
class Node{
    int value;
    Node left, right;
    Node(int value){
        this.value = value;
        left = null;
        right = null;
    }
}
class BinaryTree {

    Node root;
    BinaryTree(){
        root = null;
    }

    void printInOrder(Node node){
        if(node == null){
            return;
        }
        printInOrder(node.left);
        System.out.print(node.value + " ");
        printInOrder(node.right);
    }
    void printPreOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
    void printPostOrder(Node node){
        if(node == null){
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.value + " ");
    }

    void printPostOrder() {     printPostOrder(root); }
    void printInOrder() {     printInOrder(root); }
    void printPreOrder() {     printPreOrder(root); }


    public static void main(String []args){
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        /**
         *
         *           1
         *          / \
         *         2   3
         *        / \
         *       4   5
         *
         */
        System.out.println("Pre-order");
        bt.printPreOrder();
        System.out.println();
        System.out.println("In-order");
        bt.printInOrder();
        System.out.println();
        System.out.println("Post-order");
        bt.printPostOrder();
    }
}
