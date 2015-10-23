public class LinkedListIntersection {

	/**
	 * @param args
	 */
	private class Node {
		int data;
		Node next;
	}

	private class returnDetail {
		Node returnNode;
		int length;
	}

	private void displayList(returnDetail ret) {
		Node node = ret.returnNode;
		int length = ret.length;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println("length of list is :- " + length);
	}

	public void diffFinder(returnDetail list1, returnDetail list2) {
		int lengthList1 = list1.length;
		int lengthList2 = list2.length;
		Node node1 = list1.returnNode;
		Node node2 = list2.returnNode;
		
		if(lengthList1>lengthList2){
			
		}
	}

	private returnDetail linkedListCreator(int[] list) {
		Node head = null;
		Node counter = null;
		returnDetail obj = null;
		int length = 0;
		for (int i = 0; i < list.length; i++) {
			if (head == null) {
				head = new Node();
				head.data = list[i];
				counter = head;
				length++;
			} else {
				Node node = new Node();
				node.data = list[i];
				counter.next = node;
				counter = counter.next;
				length++;

			}
			obj = new returnDetail();
			obj.returnNode = head;
			obj.length = length;
		}
		return obj;
	}

	public void runner(int[] list) {
		displayList(linkedListCreator(list));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListIntersection obj = new LinkedListIntersection();
		int[] list = { 1, 2, 3, 4, 5, 6, 5, 6, 7, 8, 9, 1, 2, 22, 3, 333, 4455,
				234 };
		obj.runner(list);
	}

}
