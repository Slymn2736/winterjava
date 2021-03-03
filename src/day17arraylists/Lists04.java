package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists04 {
	
	/*
	 From an integer list find the closest two elements
	 */

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(43);
		list1.add(31);
		list1.add(12);
		list1.add(78);
		list1.add(16);
		list1.add(67);
		
		List<Integer> differences = new ArrayList<>();
		
		List<Integer> sorteddifferences = new ArrayList<>();
		
		List<String> indexes = new ArrayList<>();
		
		
		
		for(int i = 0; i<list1.size(); i++) {
			
			for(int k=i+1; k<list1.size(); k++) {
				
				differences.add(Math.abs(list1.get(i)-list1.get(k)));
				indexes.add(i + "" + k);
			}
			
		}
		
		System.out.println(differences);
		System.out.println(indexes);
		
		Collections.sort(differences);
		int min = differences.get(0);
		System.out.println(min);
		
		int idxMin = differences.indexOf(min);
		String str = indexes.get(idxMin);
		System.out.println(str);
		
		}

	}

