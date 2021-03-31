package day33collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Collections01 {

	public static void main(String[] args) {
		/*
		 If they ask you what is the fastest way of creating an ordered set?
		 I will create an hashset and convert it to treeset
		 */
		
		TreeSet<Integer> ts = new TreeSet<>();
		long start1 = System.currentTimeMillis();
		for(int i = 0; i<1000; i++) {
			ts.add(3*i);
		}
		System.out.println(ts.size());
		long end1 = System.currentTimeMillis();
		System.out.println(end1-start1);
		
		HashSet <Integer> hs = new HashSet<>();
		long start2 = System.currentTimeMillis();
		for(int i = 0; i<1000; i++) {
			ts.add(3*i);
		}
		System.out.println(hs.size());
		long end2 = System.currentTimeMillis();
		System.out.println(end2-start2);
		
		TreeSet<Integer> ts1 = new TreeSet<>();
		long start3 = System.currentTimeMillis();
		for(int i = 0; i<1000; i++) {
			ts.add(3*i);
		}
		System.out.println(ts1.size());
		long end3 = System.currentTimeMillis();
		System.out.println(end3-start3);
		
		
	}

}
