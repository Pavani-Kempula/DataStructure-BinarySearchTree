package com.bridgelabz.binarysearchtree;

/*
 * @author Pavani
 *
 * This class represent binary search tree.
 * Defines methods of how to insert nodes in binary search tree.
 * and how to find specific element in a tree.
 */

public class BinarySearchTree {
    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    /* A recursive function to
       insert a new key in BST */
    Node insertRec(Node root, int key) {
    	/* If the tree is empty,
           return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }
        /* Otherwise, recur down the tree */
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        }
        else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls printRecursion()
    void printTree() {
        printRecursion(root);
    }

    void printRecursion(Node root) {
        if (root != null) {
            printRecursion(root.left);
            System.out.println(root.key);
            printRecursion(root.right);
        }
    }
    public static void main(String[] args) {
        //Displaying Welcome Message
        System.out.println("Welcome To Binary Search Tree in Data Structure");

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(56);
        tree.insert(30);
        tree.insert(70);
        tree.insert(22);
        tree.insert(40);
        tree.insert(60);
        tree.insert(95);
        tree.insert(11);
        tree.insert(3);
        tree.insert(16);
        tree.insert(65);
        tree.insert(63);
        tree.insert(67);

        // print tree.
        tree.printTree();

    }
}
