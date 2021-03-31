package day33collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class LinkedHashSet02CovertArray {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
		lhs1.add(45);
		lhs1.add(5);
		lhs1.add(9);
		lhs1.add(98);
		
		
		//Try to print elements at index 2 on the console
		
		//1.Way:convert LinkedHashSet to an Array:
		Integer arr[] = new Integer[lhs1.size()];
		arr = lhs1.toArray(arr);
		System.out.println(arr[2]);
		
		//2.Way: COnvert LinkedHashSet to a list:
		List<Integer> l1 = new ArrayList<>(lhs1);
		System.out.println(l1.get(2));
		
		//3.Way: Use iterator
		get(lhs1);	
	}
	public static void get(LinkedHashSet<Integer> lhs1) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an index(0-3)");
		int idx = scan.nextInt();
		int currentIdx = 0;
		Iterator<Integer> it1 = lhs1.iterator();
		while(it1.hasNext()) {
			Integer el =  it1.next();
			if(currentIdx == idx) {
				System.out.println("The element at index " + idx + " is " + el);
			}
			currentIdx++;
		}
		scan.close();	
		
	}

}
