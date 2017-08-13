package hackerRankLinkedList;

public class HRLinkedList {

	class Node {
		int data;
		Node next;
	}

	Node MergeLists(Node headA, Node headB) {
		int size = 0;
		Node firstNode = null;
		Node lastNode = null;
		if (headA == null && headB == null) {
			return null;
		} else if (headA == null || headB == null) {
			return ((headA == null) ? headB : headA);
		} else {
			while (headA != null) {
				if (headB != null) {
					if (headA.data < headB.data) {
						if (size == 0) {
							firstNode = headA;
						}
						Node nextB = new Node();
						nextB.data = headB.data;
						nextB.next = headA.next;
						headA.next = nextB;
						lastNode = nextB;
					} else {
						Node header = new Node();
						header.data = headB.data;
						header.next = headA;
						if (size == 0) {
							firstNode = header;
						}
						lastNode = headA;
					}
					size++;
					headB = headB.next;
					headA = headA.next;
				} else {
					break;
				}
			}
			if (headB != null) {
				headA = headB;
			}

		}
		return firstNode;
	}

	public static void main(String args[]) {
		HRLinkedList lst = new HRLinkedList();
		Node nodeA = lst.new Node();

		Node nodeA1 = lst.new Node();
		nodeA.next = nodeA1;
		Node nodeA2 = lst.new Node();
		nodeA1.next = nodeA2;
		Node nodeA3 = lst.new Node();
		nodeA2.next = nodeA3;
		Node nodeA4 = lst.new Node();
		nodeA3.next = nodeA4;
		Node nodeA5 = lst.new Node();
		nodeA4.next = nodeA5;
		nodeA.data = 2;
		nodeA1.data = 5;
		nodeA2.data = 8;
		nodeA3.data = 12;
		nodeA4.data = 15;
		nodeA5.data = 27;

		Node nodeB = lst.new Node();
		Node nodeB1 = lst.new Node();
		nodeB.next = nodeB1;
		Node nodeB2 = lst.new Node();
		nodeB1.next = nodeB2;
		Node nodeB3 = lst.new Node();
		nodeB2.next = nodeB3;
		Node nodeB4 = lst.new Node();
		nodeB3.next = nodeB4;
		nodeB.data = 1;
		nodeB1.data = 2;
		nodeB2.data = 7;
		nodeB3.data = 25;
		nodeB4.data = 29;
		/*
		 * Node nodeB5 = lst.new Node(); nodeB4.next = nodeB5; nodeB5.data = 7;
		 */

		Node finalNode = lst.MergeLists(nodeA, nodeB);

		System.out.println("DONE");
	}

}
