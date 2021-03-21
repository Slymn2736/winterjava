package day16multidimensionalarrays;

import java.util.ArrayList;

public class ArrayList01 {


	/*
	 1) ArrayList are flexible in size
	 2) ArrayList cannot store multiple data types
	 ) ArrayList store non-primitve data type
	 4) ArrayList are updated version of Arrays
	 */

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		// To print an ArrayList, using just its name System.out.println() is enough
		System.out.println(list1);//[]
		
		//How to add elements into an ArrayList		
		list1.add(12);
		list1.add(21);
		list1.add(10);
		
		
		//how to add an element into a specific index
		list1.add(1, 45);
		
		System.out.println(list1); //[12, 45, 21, 10]

	}

}
