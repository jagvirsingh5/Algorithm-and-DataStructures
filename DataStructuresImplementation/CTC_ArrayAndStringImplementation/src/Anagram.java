//Problem        : Expecto Palindronum
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_65
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Your submission should *ONLY* use the following class name
public class Anagram {
	// ///////////creating a Hashmap and putting values in it and retrieving
	// valsues from it.'/////////////////
	// ////anagram.////// amazon aamozn

	public static void main(String args[]) {
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		boolean isMatch = false;
		int count = 1;
		String str = "stephens";
		String str2 = "hensstep";
		for (int i = 0; i < str.length(); i++) {
				char a = str.charAt(i);
				if(map.containsKey(a)){
					map.put(a, map.get(a)+1);
				}
				else{map.put(a, count);}
		}
		for (Entry<Character, Integer> map1: map.entrySet()) {
			System.out.println(map1.getKey()+" "+map1.getValue());
		}
		for (int i = 0; i < str2.length(); i++) {
			char b = str2.charAt(i);
			if (map.containsKey(b)) {
				isMatch = true;
			} else {
				isMatch = false;
				break;
			}
		}
		if(isMatch == false ){
			System.out.println("no match");
		}
		else{
			System.out.println("anagram");
		}
	}
}
