package day20passbyvaluepassbyreferencedate;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {
	
	//Remove repeated elements from a list
			//Example: [a, b, c, b, a, a, d] ==> [a, b, c, d]

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
	
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("a");
		list.add("a");
		list.add("d");
		
		//1. Way
		List<String> distincList = new ArrayList<>();
		for (String w: list) {
			if(distincList.contains(w)) {
				continue;
			}
			distincList.add(w);
		}
		System.out.println(distincList);//[a, b, c, d]
		
		//2.Way
		List<String> distincList1 = new ArrayList<>();
		for (String w: list) {
			if(!distincList1.contains(w)) {
				distincList1.add(w);
			}
			
		}
		System.out.println(distincList1);//[a, b, c, d]
	
		
	}

}
