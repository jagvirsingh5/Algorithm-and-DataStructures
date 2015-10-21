import java.util.Arrays;

public class StringCompression {

	/**
	 * @param args
	 *            implement a method which performs basic string compression by
	 *            counting sequences of repeating characters. Given "aaabbbccc"
	 *            it should return "a3b3c3".
	 */
	
	public void StringCompressor(String str){
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		String str = ch;
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
