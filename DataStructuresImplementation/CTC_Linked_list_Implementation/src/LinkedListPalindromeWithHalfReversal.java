
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
