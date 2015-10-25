public class TreeImplementationMethodOverloading {

	/**
	 * @param args
	 */

	private class Node {
		Node rightNode;
		Node leftNode;
		int data;

		public Node(int data) {
			rightNode = null;
			leftNode = null;
			data = data;
		}
	}

	private Node root = null;
	public TreeImplementationMethodOverloading(){
		root = null;
	}
	
	
	private void insertNode(int data){
		if(root == null){
			Node node = new Node(data);
			root = node;
		}
		else{
			
		}
	}
	private void insertNode(Node node , int data){
		if(node == null){
			node = new Node(data);
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
