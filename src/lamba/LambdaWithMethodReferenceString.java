package lamba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaWithMethodReferenceString {

		public static void main(String[] args) {
			List<String> list = new ArrayList<>();
	        list.add("Ali");
	        list.add("Mark");
	        list.add("Jackson");
	        list.add("Amanda");
	        list.add("Mariano");
	        list.add("Alberto");
	        list.add("Tucker");
	        list.add("Christ");
	        
	        printElStartA(list);
	        System.out.println("=========");
	        printElStartAOrEndingO(list);
	        System.out.println("=========");
	        sortWithLength(list);
	        System.out.println("=========");
	        printElLengthGreaterThanFive(list);
	        System.out.println("=========");
	       System.out.println(removeIfLengthLessThanFive(list));

	     
	}
		
		/*
	 	1.Functional Programming
	 	Create a method to print list elements which are starting with "A" in Upper cases
	 */
		public static void printElStartA(List<String> l) {
			//I created "startsWithA" method in "Utils" class but it is not sensible because
			//startsWithA method is very specific method. Reusability is not possible. For that kind of situations
			// no need to use method reference use lambda expression.
		l.stream().filter(Utils::startWithA).map(String::toUpperCase)
		.forEach(System.out::println);
	}
		/*
	 	2.Functional Programming
	 	Create a method to print list elements which are starting with "A" or ending "o" in lower cases
	 */
	 public static void printElStartAOrEndingO(List<String> list) { 
		 list.stream().filter(t->t.startsWith("A")||t.endsWith("o"))
		 .map(String::toLowerCase).forEach(System.out::println);	 
	 }
	 
	 /*
	 	3.Functional Programming
	 	Create a method to print the elements in uppercases after ordering according to their lengths
	 */
	 public static void sortWithLength(List<String> l) {
		 l.stream().map(String::toUpperCase).sorted(Comparator.comparing(String::length))
		 .forEach(System.out::println);
	 }
	 
	 /*
	  	4. Use “Functional Programming”	
	 	Create a method to print the element if the length is greater than 5.	  
	  */
	 public static void printElLengthGreaterThanFive(List<String> list) {
		list.stream()
		.filter(t->t.length()>=5)
		.forEach(System.out::println);
	 }
	 /*
	  	5. Use “Functional Programming”	
	 	Create a method to remove the element if the length is less than 5.	  
	  */	
	 public static List<String> removeIfLengthLessThanFive(List<String> l){
		 
		 l.removeIf(t->t.length()<5);
		 
		 return l;
	 }

}
