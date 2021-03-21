package day17arraylists;

import java.util.ArrayList;

import java.util.List;

public class Lists04FindTheClosetElements {
	
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
		
		List<String> indexes = new ArrayList<>();
		
		for(int i=0; i<list1.size(); i++) {
			for(int k=i+1; k<list1.size(); k++) {
				differences.add(Math.abs(list1.get(i) - list1.get(k)));
				indexes.add(i + "" + k);
			}
		}
		System.out.println(differences);// [41, 29, 10, 76, 14, 65, 12, 31, 35, 27, 24, 19, 47, 15, 36, 66, 4, 55, 62, 11, 51]
		System.out.println(indexes);// [01, 02, 03, 04, 05, 06, 12, 13, 14, 15, 16, 23, 24, 25, 26, 34, 35, 36, 45, 46, 56]
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<differences.size(); i++) {
			if(min>differences.get(i)) {
				min=differences.get(i);
			}
		}
		System.out.println(min);//4
		
		int idxMin = differences.indexOf(min);
		String str = indexes.get(idxMin);
		System.out.println(str);//35
		
		System.out.println("First number: " + list1.get(Integer.valueOf(str.substring(0, 1))));//12
		System.out.println("Second number: " + list1.get(Integer.valueOf(str.substring(1, 2))));//16

	}
	

	}


