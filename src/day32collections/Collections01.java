package day32collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
		
		// If you want to use Queue methods for a linked list use "Queue" as data type
		// If you want to use List methods for a linked list use "List" as data type
		
		LinkedList<String> ll1 = new LinkedList<>();
		
		LinkedList<String> ll2 = new LinkedList<>();
		ll2.add("!");
		ll2.add("?");
		
		ll1.add(0, "A");
		ll1.add(0, "B");
		ll1.add("C");
		ll1.addAll(ll2);
		ll1.addAll(1,ll2);
		
		ll1.addFirst("X");
		ll1.addLast("Z");
		
		System.out.println(ll1.element());
		
		System.out.println(ll1.peek());
		
		System.out.println(ll1.getFirst());
		
		System.out.println(ll1.getLast());
		
		System.out.println(ll1.poll());
		
		System.out.println(ll1);
		
	

	}

}
