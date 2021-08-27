package com.bridgelabz.binarysearchtree;

public class MyBinaryTreeRunner {

	public static void main(String[] args) {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.size();
		System.out.println("The size of binary tree is :- " + size);

	}

}
