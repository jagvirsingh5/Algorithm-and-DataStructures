import java.util.Arrays;
import java.util.HashMap;

public class StringCompression {

	/**
	 * @param args
	 *            implement a method which performs basic string compression by
	 *            counting sequences of repeating characters. Given "aaabbbccc"
	 *            it should return "a3b3c3".
	 */

	public void StringCompressor(String str1) {
		String str = StringSorter(str1);
		char[] ch = str.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i =0 ; i< str.length();i++){
			int value=1;
			if(!hm.containsKey(ch[i])){
				hm.put(ch[i], value);
			}
			else{
				hm.put(ch[i], (hm.get(ch[i])+1));
			}
		}
	}
	
	public String StringSorter(String str){
		 
		 char[] ch = str.toCharArray();
		 StringBuilder sb = new StringBuilder();
		 Arrays.sort(ch);
		 for(char c : ch ){sb.append(c);}
		 str= sb.toString();
		 return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompression obj = new StringCompression();
		obj.StringCompressor("jagvir");

	}

}
