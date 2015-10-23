import java.util.Stack;
import java.util.Iterator;

public class SortStack<T> {

	/**
	 * @param args
	 */
	private void sortStack(Stack stk) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk = new Stack<Integer>();

		stk.push(7);
		stk.push(9);
		stk.push(10);
		stk.push(11);
		stk.push(456);
		stk.push(3);
		stk.push(1340);
		stk.push(9);
		stk.push(43);
		stk.push(15);
		stk.push(96);

		Iterator it = stk.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
