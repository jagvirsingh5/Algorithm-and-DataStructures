public class bitPalindrome {

	/**
	 * @param args
	 */

	private String convertToString(int data) {
		StringBuilder sb = new StringBuilder();
		boolean flag = true;
		while (flag) {
			int rem = data % 2;
			data = data / 2;
			sb = sb.append(rem);
			if (data == 0) {
				flag = false;
			}
		}
		String ret = sb.toString();

		return ret;
	}

	private boolean isPalindrome(int data) {
		String str = convertToString(data);
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ch[(ch.length-1) - i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		bitPalindrome obj = new bitPalindrome();
		System.out.println(obj.isPalindrome(10));
	}
}
