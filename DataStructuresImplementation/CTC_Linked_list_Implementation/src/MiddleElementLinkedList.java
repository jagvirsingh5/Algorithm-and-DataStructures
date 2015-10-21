


public class MiddleElementLinkedList {

	/**
	 * @param args
	 */
	public class Node {
		Node next;
		int data;
	}
	

	public void disp(Node head) {
		Node c = head;
		while (c.next != null) {
			System.out.println(c.data + " ");
			c = c.next;
		}
	}
	
	public void LLCreator(int[] list) {
		  Node head=null;
		  Node temp=null;
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
	 
		disp(head);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
