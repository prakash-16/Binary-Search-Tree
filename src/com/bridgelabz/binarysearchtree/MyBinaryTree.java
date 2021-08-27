package com.bridgelabz.binarysearchtree;

public class MyBinaryTree<K extends Comparable<K>> {

	private MyBinaryNode<K> root;

	public void add(K key) {
		this.root = this.addNode(root, key);
	}

	public MyBinaryNode<K> addNode(MyBinaryNode<K> root, K key) {

		if (root == null) {
			return new MyBinaryNode<>(key);
		}
		int compare = key.compareTo(root.key);
		if (compare == 0) {
			return root;
		}
		if (compare > 0) {
			root.rightNode = addNode(root.rightNode, key);
		} else {
			root.leftNode = addNode(root.leftNode, key);
		}
		return root;
	}

	public int size() {
		return this.sizeOfNode(root);
	}

	public int sizeOfNode(MyBinaryNode<K> root) {
		if (root == null) {
			return 0;
		}
		int result = 1 + this.sizeOfNode(root.leftNode) + this.sizeOfNode(root.rightNode);
		return result;
	}

	public boolean search(K key) {
		return this.searchNode(root, key);

	}

	public boolean searchNode(MyBinaryNode<K> root, K key) {
		if (root == null) {
			return false;
		}
		int result = key.compareTo(root.key);
		if (result == 0) {
			return true;
		} else {
			if (result > 0) {
				return searchNode(root.rightNode, key);
			} else {
				return searchNode(root.leftNode, key);

			}
		}
	}

}
