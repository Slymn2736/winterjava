package day31interfacecollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {
	
	/*
	 	1) By using loops we cannot update collections, but by using "iterator" or "listiterator" we can.
	 	2) "Listiterator" is more functional then "iterator"
	 	3) "Listiterator" and "iterator" are interfaces
	 	4) Inside the "iterator" we have hasNext(), next(), remove(), and forEachRemainng() methods.
	 	
	 */

	public static void main(String[] args) {
		
		// By using List.of(), you can create an add methods shortly
		
	//	List<String> list1 = List.of("A", "C", "B");
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("C");
		list1.add("B");
		System.out.println(list1); //[A, C, B]
		
		for(String w: list1) {
			w = w + "X";
		}
		System.out.println(list1); // [A, C, B]
		
		Iterator<String> it1 = list1.iterator();
		while(it1.hasNext()) {
			it1.next();
			it1.remove();
		}
		
		System.out.println(list1);//[]
		
	}

}
