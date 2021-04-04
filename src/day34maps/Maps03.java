package day34maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {
	
	/*
	 	Create a method which return the number of every character which is used in a String
	 	Example: Hellooo ==> H=1, e=1, l=2, o=3
	 */

	public static void main(String[] args) {
		
		System.out.println(getNumOfChars("Hellxxxooo"));
		

	}

	public static HashMap<String, Integer> getNumOfChars(String str) {
		HashMap<String, Integer> hm = new HashMap<>();
		String arr[] = str.split("");
		System.out.println(Arrays.toString(arr));
		
		for(String w : arr) {
			if(!hm.containsKey(w)) {
				hm.put(w, 1);
			}else {
				hm.put(w, hm.get(w)+1);			}
		}	
		return hm;
		
	}
	
}
