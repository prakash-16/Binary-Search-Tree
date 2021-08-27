package com.bridgelabz.binarysearchtree;

public class MyBinaryNode<K extends Comparable<K>> {

	K key;
	MyBinaryNode<K> rightNode;
	MyBinaryNode<K> leftNode;

	public MyBinaryNode(K key) {
		this.key = key;
		this.rightNode = null;
		this.leftNode = null;
	}

}
