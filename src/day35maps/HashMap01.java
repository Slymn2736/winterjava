package day35maps;

import java.util.HashMap;

public class HashMap01 {
	
	/*
	 	How a HashMap works internally in Java
	 	1) if you fill 75% of buckets Java creates new 16 buckets. this is called "Load Factor"
	 	2) Java create "HashCode" by using "Key", then concerts the HashCode to existing indexes
	 		then put the data into bucket by using the index.
	 	3) Sometimes the indexes which are created from HashCodes can be same, this is called "Hash Collision"
	 	4) Java uses LinkedList in every bucket. If "Hash Collision" occurs, Java can put multiple data into a bucket
	 		by using Linked list structure.
	 */

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		
		hm.put("Name", "Ali");
		hm.put("Id", "101");

	}

}
