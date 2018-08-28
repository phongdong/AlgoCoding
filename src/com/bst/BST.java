package com.bst;

class Node {
	int key;
	Node left, right;
	public Node(int item) {
		key = item;
		left = right = null;
	}
}

public class BST {
	Node root;
	public BST() {
		root = null;
	}
	public Node search(Node root, int key) {
		if (root == null || root.key == key) {
			return root;
		}
		if (root.key > key) {
			return search(root.left, key);
		}
		return search(root.right, key);
	}

	public static void main(String[] args) {
		BST bst = new BST();
		bst.root = new Node(8);
		bst.root.left = new Node(3);
		bst.root.right = new Node(10);
		
		bst.root.left.left = new Node(1);
		bst.root.left.right = new Node(6);
		
		bst.root.right.right = new Node(14);
		
		bst.root.left.right.left = new Node(4);
		bst.root.left.right.right = new Node(7);
		
		bst.root.right.right.left = new Node(13);
		
		System.out.println(bst.search(bst.root, 7).key);

	}
}
