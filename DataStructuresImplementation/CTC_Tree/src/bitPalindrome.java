import java.util.NoSuchElementException;
import java.util.Iterator;

public class bitPalindrome {

	/**
	 * @param args
	 */
	private class Node {
		Node next;
		int data;

		private Node(int data) {
			this.data = data;
		}
	}

	private Node head = null;

	public Node bitConvertor(int data) {
		int remainder = 0;
		Node counter = null;
		if (data == 0)
			throw new NoSuchElementException("0 is not valid input");
		else {
			remainder = data % 2;
			head = new Node(remainder);
			counter = head;
			data = data / 2;
			while ((data) != 0) {
				remainder = data % 2;
				data = data / 2;
				Node node = new Node(remainder);
				counter.next = node;
				counter = counter.next;
			}

		}
		return head;
	}

	public void printNumber(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	private Node middleNodeFinder() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node pass = slow.next;
		slow.next = null;

		return pass;
	}

	private Node listReversor() {

		Node middNode = middleNodeFinder();
		Node fast = middNode.next;
		Node slow = middNode;
		Node temp;
		slow.next = null;
		while (fast != null) {
			temp = fast.next;
			fast.next = slow;
			slow = fast;
			fast = temp;
			temp = null;

		}
		 printNumber(slow);
		return slow;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bitPalindrome obj = new bitPalindrome();
		Node node = obj.bitConvertor(42);
		obj.printNumber(node);
		obj.listReversor();
	}

}
