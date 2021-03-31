package day33collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
	/*
	 	1) It adds elements in "insertion order"
	 	2) It is fast adding and deleting. (Not fast than hashset) 
	 */

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
		lhs1.add("A");
		lhs1.add("K");
		lhs1.add("c");
		lhs1.add("n");
		System.out.println(lhs1); //[A, K, c, n]
		lhs1.add("n"); // When you try to add same element it will overwrite it
		System.out.println(lhs1);//[A, K, c, n]
		
		System.out.println(lhs1.hashCode()); //349
		
		LinkedHashSet<String> lhs2 = new LinkedHashSet<>();
		lhs2.add("A");
		lhs2.add("j");
		lhs2.add("c");
		lhs2.add("b");
		
		//retainAll() it removes different elements
		//it return false if all of the elements are same
		// lhs1.retainAll(lhs2)==> changes, lhs2 does not change
		System.out.println(lhs1.retainAll(lhs2));
		System.out.println(lhs1);//[A, c]
		System.out.println(lhs2);//[A, j, c, b]
		// hashCode(): The hash code of a set is
        // defined to be the sum of the hash codes of the elements in the set
		lhs2.add(null);
		System.out.println(lhs2); //[A, j, c, b, null]
		
		

	}

}
