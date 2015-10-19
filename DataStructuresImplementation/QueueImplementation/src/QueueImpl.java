
public class QueueImpl<E> {

	/**
	 * This is a queue Implementation using the concept of Qbjects and linkedlist ...
	 * The aim of this exercise is to understand the usage of queue , its complexity and traversal time and 
	 * eventually its advantages over other datastuctures.
	 * Just like the Queue API where we will be checking Insert, Remove and Examine methods
	 * and throw exceptions whenever necessary
	 */
	Node<E> head,temp;
	
	
	public class Node<E>{
		E data;
		Node next;
	}
	
	public void add(E data){
		if(head == null){
			head = new Node<E>();
			head.data= data;
			temp = head;
			
		}
		else{
			Node<E> counter = new Node<E>();
			counter.data=data;
			temp.next= counter;
			temp = temp.next;
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
