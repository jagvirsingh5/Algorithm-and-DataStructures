public class TreeImplementation {

	/**
	 * @param args
	 */
	private class Node {
		Node leftNode;
		Node rightNode;
		int data;
	}

	int z = 0;
	int x = 0;
<<<<<<< HEAD
	int y = 0;int a=0;
=======
	int y = 0;
	int w=0;
>>>>>>> 23ecd0bf121b3db04dc01a6a9a65c467c4e430a6

	private void insert(Node node, int data) {
		if (node == null) {
			node = new Node();
			node.data = data;
		} else {
			if (data < node.data) {
				insert(node.leftNode, data);

			} else {
				insert(node.rightNode, data);
			}
		}
	}

	private boolean lookup(Node node, int data) {
		if (node == null) {
			return false;
		}
		if (data == node.data) {
			return true;
		}
		if (data < node.data) {
			lookup(node.leftNode, data);
		} else {
			lookup(node.rightNode, data);
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
