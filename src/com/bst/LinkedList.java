package com.bst;

public class LinkedList {
	static Node head;
	
	static class Node {
		int key;
		Node next;
		boolean isVisited;
		Node(int item) {
			this.key = item;
			this.next = null;
			isVisited = false;
		}
	}
	
	static void printList(Node node) {
		while (node != null) {
			System.out.print(head.key + " ");
			node = node.next;
		}
	}
	
	static boolean detectLoop() {
		Node slow_node = head;
		Node fast_node = head;
		while (slow_node != null && slow_node.next != null && fast_node != null)
		{
			slow_node = slow_node.next;
			fast_node = fast_node.next.next;
			if (slow_node == fast_node) {
				return true;
			}
		}
		return false;
	}
	
	static boolean isLoop(Node node) {
		while (node != null) {
			if (node.isVisited)
				return true;
			node.isVisited = true;
			node = node.next;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		

	}

}
