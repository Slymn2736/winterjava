package day34maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Maps04 {
	
	/*
	 	Create a method to return non-repeated elements from a list
	    Example: Hellooo ==> [H, e]
	 */

	public static void main(String[] args) {
		
		System.out.println(nonRepeatedElements("Hellooo"));

	}
	
	public static List<String> nonRepeatedElements(String str){
		
		List<String> list = new ArrayList<>();
		HashMap <String, Integer> hm = new HashMap<>();
		
		String arr[] = str.split("");
		
		for(String w : arr) {
			
			hm.computeIfPresent(w, (key, value)->value+1);
			hm.computeIfAbsent(w, k->1);
		}
		System.out.println(hm);
		
		for(Entry<String, Integer> w : hm.entrySet()) {
			
			if(w.getValue()==1) {
				list.add(w.getKey());
			}
		}
		return list;
		
	}
}
