public class TreeImplementation {

	/**
	 * @param args
	 */
	private class Node {
		Node rightNode;
		Node leftNode;
		int data;
	}

	Node root;
	Node counter;

	public TreeImplementation() {
		root = null;
	}

	private void insert(int data) {
		if (root == null) {
			root = new Node();
			root.data = data;
			counter = root;
		} else {
			if (data < counter.data && counter.leftNode == null) {
				Node node = new Node();
				node.data = data;
				counter.leftNode = node;

			}
			if (data > counter.data && counter.rightNode == null) {
				Node node = new Node();
				node.data = data;
				counter.rightNode = node;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeImplementation obj = new TreeImplementation();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ((int) (Math.random() * 10));
		}

	}

}
