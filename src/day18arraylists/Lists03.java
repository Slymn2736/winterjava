package day18arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists03 {

	public static void main(String[] args) {
		
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(21);
		list1.add(32);
		list1.add(25);
		list1.add(90);
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(111);
		list2.add(222);
		list2.add(333);
		list2.add(444);
		list2.add(555);
		
		//How to join two lists
		//List1 changes below
		//addAll() method adds the elements at the end
		System.out.println(list1.addAll(list2));//true
		
		System.out.println(list2);//111, 222, 333, 444, 555
		System.out.println(list1);//[12, 21, 32, 25, 9, 111, 222, 333, 444, 555]
		
		list1.addAll(2, list2);
		System.out.println(list1); //[12, 21, 111, 222, 333, 444, 555, 32, 25, 9, 111, 222, 333, 444, 555]

		// how to delete all elements from a list 
		//clear () method removes all elements from the list
		//clear () method return nothing==> return type is "void"
	//	list2.clear();
	//	System.out.println(list2);
		
		//How to check existing of multiple elements 
		//containsAll() method returns true if all elements of list2 exist in the list1
		System.out.println(list1.containsAll(list2));
		
		//How to get the index of last occurrence of an element in a list
		//[12, 21, 111, 222, 333, 444, 555, 32, 25, 9, 111, 222, 333, 444, 555]
		System.out.println(list1.lastIndexOf(111));
		
		//How to remove multiple elements from a list
		//[12, 21, 111, 222, 333, 444, 555, 32, 25, 9, 111, 222, 333, 444, 555]
		//[111, 222, 333, 444, 555]
		list1.removeAll(list2);
		System.out.println(list1);//[12, 21, 32, 25, 90]
		
		//How to delete elements by using some conditions
		list1.removeIf(t->t>35);
		System.out.println(list1); //[12, 21, 32, 25]
		
		list1.removeIf(t->t%2!=0); // Lambda expression
		System.out.println(list1); //[12, 32]
		
		//How to get a specific part of a list
		//subList(1, 3) ==> 1 is inclusive, 3 is exclusive
		//subList(1, 3) ==> return the sublist
		System.out.println(list2.subList(1, 3)); //[222, 333]

		//How to covert a list to an array
		System.out.println(list2.toArray());//[Ljava.lang.Object;@4c3e4790
		System.out.println(Arrays.toString(list2.toArray()));//[111, 222, 333, 444, 555]
		
		//How to convert an array to a list
		//when you create a list by using array, some array features transferred to the list
		//as you know, arrays are not flexible in the list which is created form an array will not be
		//flexible in size.
		
		//Note: The methods are not related with length can be used in lists which are created from arrays.
		Integer arr[] = {1, 54, 21, 13};
		List<Integer> list3 = Arrays.asList(arr);
		
		System.out.println(list3); //[[I@27ddd392] //[1, 54, 21, 13]
		
		//list3.remove(2);//UnsupportedOperationException
		//list3.clear();//UnsupportedOperationException
		//list3.add(34);//UnsupportedOperationException
		list3.set(1, 63);
		System.out.println(list3);//[1, 63, 21, 13]
		
		System.out.println(list3.subList(2, 4));// [21, 13]
		
		
	}

}
