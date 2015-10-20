public class OneAwayStringComparison {

	/**
	 * @param args
	 *            Three function that can be performed on string ;insert delete,
	 *            replace. given two strings, write a function to check if they
	 *            are one edit (or zero edits) away
	 */
	public void StringComparator(String str1, String str2) {
		if (str1.length() - str2.length() == 1) {
		}
		if (str2.length() - str2.length() == 1) {
		}
	}

	/**
	 * @param str1
	 * @param str2
	 * assumption is that str1.length() < str2.length()
	 */
	public boolean StringInsertChecker(String str1, String str2) {
	int index1 = 0,index2 = 0;
	int diffCounter=0;
		while(index1 < str1.length() && index2<str2.length()){
			char ch1 = str1.charAt(index1);
			char ch2 = str2.charAt(index2);
			
			if(ch1!=ch2){
				diffCounter++;
				index2++;
			}else{
				index1++;
				index2++;
			}
			if(diffCounter>1){
				return false;
			}
		}return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneAwayStringComparison obj = new OneAwayStringComparison();
		System.out.println(obj.StringInsertChecker("abdc", "abc"));
	}

}
