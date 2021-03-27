package day31interfacecollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Iterator03 {
	
	/*
	 	Create an integer list
		 Increase all elements by 2
		 Print the “list elements” on the console in reverse order.
		 Print the list on the console in reverse order by using reverse()
	 */

	public static void main(String[] args) {
		List<Integer> list4 = new ArrayList<>();
		list4.add(12);
		list4.add(13);
		list4.add(14);
		list4.add(15);
		System.out.println(list4);
		
		ListIterator<Integer> it1 = list4.listIterator();
		while(it1.hasNext()) {
			Integer el = it1.next();
			it1.set(el + 2);
		}

		while(it1.hasPrevious()) {
			Integer el =it1.previous();
			System.out.print(el + " ");
		}
		System.out.println();
		System.out.println(list4);//[14, 15, 16, 17]
		
		Collections.reverse(list4);
		System.out.println(list4);//[17, 16, 15, 14]
		
	}

}
