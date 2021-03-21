package day19foreachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop04PrintCommonEl {
	
	// Create 2 integer lists and print the common elements on the console
	// If there is no any common element print “No common elements” on the console
	// Example: list1 = [1, 3, 2, 4]  list2 = [2, 4, 6, 8, 10] ==> 2 4

	public static void main(String[] args) {
		

		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);
		System.out.println(list1);//[11, 12, 13, 14, 15]
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(7);
		list2.add(14);
		list2.add(11);
		list2.add(14);
		list2.add(15);
		list2.add(17);
		System.out.println(list2);//[7, 14, 11, 14, 15, 17]
		
		List<Integer> commonEl = new ArrayList<>();
		
		for(int w : list1) {
			
			for(int t : list2) {
				if(w==t) {
					if(!commonEl.contains(w)) {
						commonEl.add(w);
					}
				}
			}
			
		}
		System.out.println(commonEl);//[11, 14, 15]
		
		
	}

}
