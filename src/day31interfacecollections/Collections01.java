package day31interfacecollections;

import java.util.LinkedList;
import java.util.List;

public class Collections01 {
	
	/*
	 	Collections are a) List (interface) ==> 1-ArrayList(Class) 2-LinkedList(Class)
	 						List<Integer> list5 = new ArrayList<>();
	 						List<Integer> list5 = new LinkedList<>();
	 						
	 					b) Queue (Interface) ==> 1-PriorityQueue(Class) 2-Deque(Interface)
	 					
	 					c) Set(Interface) ==> 1-HashSet(Class) 2- LinkedHashSet(Class) 3-SortedSet(Interface)
	 											4-TreeSet(Class)
	 											
	 	LinkedList: 1) It is a class
	 				2) It is good at "adding" and "removing" elements
	 				3) Every elements is connected with each other
	 				4) Every elements has "data" and "pointer" parts
	 				5) Elements are called as "node"
	 				6) Every LinkedList has "head" part, "head" has just "pointer" part
	 				7) Last element is called "tail" in linkedList, it pointer "null"
	 				8) It is not successful in searching elements and updating elements
	 */

	public static void main(String[] args) {
		
		List<String> ll1 = new LinkedList<>();
		ll1.add(0, "A");
		ll1.add(0, "B");
		
		System.out.println(ll1);

	}

}
