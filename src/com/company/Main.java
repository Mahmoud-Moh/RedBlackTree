package com.company;

public class Main {

    public static void main(String[] args) {
        RedBlackTree bst = new RedBlackTree();
        bst.insert(42);
        bst.insert(10);
        bst.insert(64);
        bst.insert(83);
        bst.insert(7);
        bst.insert(29);
        bst.insert(50);
        bst.insert(5);
        bst.insert(89);
        bst.insert(23);
        bst.insert(31);
        //bst.printTree();

        //System.out.println("\nAfter deleting:");
        bst.deleteNode(10);
        bst.printTree();
    }
}
