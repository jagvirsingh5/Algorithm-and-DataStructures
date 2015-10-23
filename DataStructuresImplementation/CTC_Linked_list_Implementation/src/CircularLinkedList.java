public class CircularLinkedList {

	/**
	 * @param args
	 *            Detect and Remove Loop in a Linked List Write a function
	 *            detectAndRemoveLoop() that checks whether a given Linked List
	 *            contains loop and if loop is present then removes the loop and
	 *            returns true. And if the list doesn’t contain loop then
	 *            returns false. Below diagram shows a linked list with a loop.
	 *            detectAndRemoveLoop() must change the below list to
	 *            1->2->3->4->5->NULL.
	 */
	
	private class Node{
		int data;
		Node next;
	}
	
	private Node llCreator(int[] list){
		Node head = null;
		Node counter= null;
		for(int i = 0 ; i < list.length; i ++){
			if(head == null){
				head = new Node();
				counter = head;
				counter.data = list[i];
				
			}
			else{}
		}
		
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
