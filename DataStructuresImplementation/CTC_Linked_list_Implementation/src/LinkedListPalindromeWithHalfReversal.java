public class LinkedListPalindromeWithHalfReversal {

	/**
	 * @param args
	 */
	public class Node {
		Node next;
		int data;
	}

	public void disp(Node head) {
		System.out.println("list is :- ");

		Node c = head;
		while (c != null) {
			System.out.print(c.data + " ");
			c = c.next;
		}
		System.out.println();
	}

	public Node LLCreator(int[] list) {
		Node head = null;
		Node temp = null;
		for (int i = 0; i < list.length; i++) {
			if (head == null) {
				head = new Node();
				head.data = list[i];
				temp = head;
			} else {
				Node n = new Node();
				n.data = list[i];
				temp.next = n;
				temp = n;
			}
		}

		System.out.println(palindromeFinder(LLMiddleFinder(head)));
		// System.out.println("reversal");
		return head;
	}

	/**
	 * @param node
	 *            aim is to find the middle element and reverse only that part
	 *            of the linkedlist and compare the part beyond woth the front
	 *            part
	 */
	public Node LLMiddleFinder(Node node) {
		Node end = node;
		Node middle = node;
		while (end != null && end.next != null) {
			middle = middle.next;
			end = end.next.next;
		}
		middle.next = LLReversal(middle.next);

		return node;
	}

	public Node LLReversal(Node node) {
		Node fast = node.next;
		Node slow = node;
		Node temp = null;
		slow.next = null;
		if (fast == null || fast.next == null) {
			return null;
		}
		while (fast != null) {
			temp = fast.next;
			fast.next = slow;
			slow = fast;
			fast = temp;
			temp = null;
		}
		return slow;
	}

	public boolean palindromeFinder(Node node) {
		disp(node);
		Node end = node;
		Node middle = node;
		while (end != null && end.next != null) {
			middle = middle.next;
			end = end.next.next;
		}
		Node rear = middle.next;
		Node front = node;
		
		while (front != null && rear!=null) {
			System.out.println(rear.data+" "+ front.data);
			if (front.data != rear.data) {
				return false;
			} else {
				rear = rear.next;
				front = front.next;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListPalindromeWithHalfReversal obj = new LinkedListPalindromeWithHalfReversal();
		int[] list = { 1, 2, 3, 4,5,6,7,6,5,4, 3, 2, 1 };
		obj.LLCreator(list);
	}

}
