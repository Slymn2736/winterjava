package day33collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01FirstElement {

	public static void main(String[] args) {
		
		/*
		 PriorityQueue puts the elements in order to a rule which Java creates
		 If you want to create a rule and order elements according to that rule
		 we can use PriorityQueue.
		 There is a Comparable class, by  using that class you can create some methods to order elements.
		 PriorityQueue can be in FIFO(First In First Out).
		 */
		
		Queue <String> q1 = new PriorityQueue<>();
		
		q1.add("Merve");
		q1.add("Shadi");
		q1.add("Ahmet");
		q1.add("Serife");
		q1.add("Melike");
		
		System.out.println(q1);//[Ahmet, Melike, Merve, Shadi, Serife]
		System.out.println(q1.element());// Ahmet
		System.out.println(q1);//[Ahmet, Melike, Merve, Shadi, Serife]
							   // element() method is like copy-paste, it returns first element
								// but it does not remove it.
								// throws exception when queue is empty
		
		System.out.println(q1.peek());// Ahmet
									// peek() method is like copy-paste, it returns first element
									// but it does not remove it.
									//returns "null" when queue is empty
		System.out.println(q1);//[Ahmet, Melike, Merve, Shadi, Serife]
		
		System.out.println(q1.poll());//Ahmet
		System.out.println(q1);//[Melike, Serife, Merve, Shadi]
								// poll() method is like cut-paste, it returns first element
								// but it does not remove it.
								//returns "null" when queue is empty
		
		System.out.println(q1.remove());// Melike
										// remove() method is like cut-paste, it returns first element
										// but it does not remove it.
										// it throws exception when queue is empty
		System.out.println(q1);//[Merve, Serife, Shadi]
		
		//If you need a queue which is in insertion order use LinkedList to create object.
		Queue<String> q2 = new LinkedList<>();
		q2.add("n");
		q2.add("a");
		q2.add("nk");
		q2.add("y");
		System.out.println(q2); //[n, a, nk, y]
		
		//Deque : Double ended queue
		//If you want to use FIFO and LIFO together, use deque.
		//It has many specific methods for first and last elements
		Deque <String> dq1 = new LinkedList<>();
		dq1.add("I");
		dq1.add("like");
		dq1.add("Java");
		dq1.add("x");
		System.out.println(dq1); //[I, like, Java, x]
		
		dq1.addFirst("aaa");
		System.out.println(dq1);//[aaa, I, like, Java, x]
		
		dq1.addLast("kkk");
		System.out.println(dq1);//[aaa, I, like, Java, x, kkk]
		
		
		
	}

}
