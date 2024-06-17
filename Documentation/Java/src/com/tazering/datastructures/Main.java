package com.tazering.datastructures;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert("Luke");
        bst.insert("Vader");
        bst.insert("Han");
        bst.insert("Chewbacca");
        bst.insert("Yoda");
        bst.insert("Obi");
        bst.insert("Leia");
        bst.insert("Lando");

        System.out.println(bst.inOrder());
    }

}
