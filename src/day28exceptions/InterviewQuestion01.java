package day28exceptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterviewQuestion01 {
	/*
	 	Create a method which return two integers whose multiplication is the maximum
	 
	 	12, 7, 3, 11, 8 ==>12 and 11
	 */

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		list.add(12);
		list.add(7);
		list.add(3);
		list.add(11);
		list.add(8);
		System.out.println(maxTwo(list));

	}
	
	public static List<Integer> maxTwo(List<Integer> list){
		
		List<Integer> result = new ArrayList<>();
		Collections.sort(list);
		
		if(list.get(0)*list.get(1)> list.get(list.size()-2)*list.get(list.size()-1)) {
			result.add(list.get(0));
			result.add(list.get(1));
		}else {
			result.add(list.get(list.size()-2));
			result.add(list.get(list.size()-1));	
			
		}
		
		return result;
		
		
	}


}
