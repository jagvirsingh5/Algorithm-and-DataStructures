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

	public TreeImplementation() {
		root = null;
	}

	private void insert(int data) {
		if (root == null) {
			root = new Node();
			root.data = data;
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
