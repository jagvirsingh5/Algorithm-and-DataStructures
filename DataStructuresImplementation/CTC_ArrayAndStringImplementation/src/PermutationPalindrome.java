import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PermutationPalindrome {

	/**
	 * @param args
	 *            Write an efficient function that checks whether any
	 *            permutation ↴ of an input string is a palindrome ↴ . Examples:
	 * 
	 *            "civic" should return True "ivicc" should return True "civil"
	 *            should return False "livci" should return False Solution :-
	 *            The palindrome of a string will have only one alphabet that
	 *            would have ODD no of occurance
	 */

	private HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

	public void PermutationCalculator(String str) {
		char[] ch = str.toCharArray();
		for (char c : ch) {
			int value = 1;
			if (hm.containsKey(c)) {
				hm.put(c, (hm.get(c) + 1));
			}else{
				hm.put(c, value);
			}
		}
		for(Map.Entry<Character, Integer> entry : hm.entrySet()){
			char ch2 = entry.getKey();
			int i = entry.getValue();
			System.out.println("key:- "+ch2+" value :- "+i);
		}
	}
	
	public boolean PermCalculator(HashMap<Character,Integer> hashmap){
		int sumOfOddNumbers=0;
		for(Map.Entry<Character, Integer> entry : hashmap.entrySet()){
			int i = entry.getValue()%2;
			if(i!=0 && sumOfOddNumbers>1){
				return false;
				
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PermutationPalindrome pp = new PermutationPalindrome();
pp.PermutationCalculator("AABBCCDDEE");
	}

}
