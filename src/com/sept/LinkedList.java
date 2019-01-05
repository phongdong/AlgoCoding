package com.sept;


public class LinkedList {
	static Node head;
	
	static class Node {
		int data;
		Node next;
		Node(int value) {
			data = value;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList(); 
        list.head = new Node(50); 
        list.head.next = new Node(20); 
        list.head.next.next = new Node(15); 
        list.head.next.next.next = new Node(4); 
        list.head.next.next.next.next = new Node(10); 
        
        head.next.next.next.next.next = head.next; 
        list.detectAndRemoveLoop(head); 
        System.out.println("Linked List after removing loop : "); 
        list.printList(head); 

	}

	static void detectAndRemoveLoop(Node node) {
		Node sNode = node;
		Node fNode = node;
		Node loop = null;
		Node start = null;
		while (sNode != null && fNode != null && fNode.next != null ) {
			sNode = sNode.next;
			fNode = fNode.next.next;
			if (sNode == fNode) {
				int k = countLoopLength(sNode);
				loop = node;
				while (k > 0) {
					loop = loop.next;
					k--;
				}
				start = node;
				while (start.next != loop.next) {
					start = start.next;
					loop = loop.next;
				}
				
				if (start.next == loop.next) {
					loop.next = null;
				}
				
			}
		}
	}
	
	static int countLoopLength(Node loop) {
		Node pt = null;
		int count = 0;
		while (true) {
			pt = loop;
			while (pt.next != loop) {
				pt = pt.next;
				count++;
			}
			if (pt.next == loop) {
				count++;
				break;
			}
		}
		return count;
	}
	
	static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	
	static void removeNode(Node loop, Node node) {
		Node pt1 = null;
		Node pt2 = null;
		
		pt1 = node;
		while (true) {
			pt2 = loop;
			while (pt2.next != loop && pt2.next != pt1) {
				pt2 = pt2.next;
			}
			if (pt2.next == pt1) {
				break;
			}
			pt1 = pt1.next;
		}
		pt2.next = null;
	}

	
}
