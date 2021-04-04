package day35maps;

import java.util.Hashtable;

public class HashTable {

	/*
	 	What is the difference between "HashMap" and "HashTable"?
	 	1) HashMap accepts "null" in "key" just once and in "value" many times
	 		HashTable does not accept null in anywhere
	 		
	 	2) HashMap is not thread-safe and not synchronized.(Fast)
	 		HashTable is tread-safe and synchronized.(Slow)
	 		
	 	Note: Both put the elements in random order
	 */
	
	public static void main(String[] args) {
		
		Hashtable<String, String> ht = new Hashtable<>();
		ht.put("Name", "Ali");
		
		
		
		
		
	}

}
