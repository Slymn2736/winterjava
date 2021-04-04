package lamba;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class LambdaWithStrings {

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
        System.out.println();
        printElStartAOrEndingO(list);
        System.out.println();
        sortWithLength(list);
        System.out.println();
        sortWithLast(list);
        System.out.println();
        printLengthOfEl(list);
        System.out.println();
        removeLessThanFive(list);
        System.out.println();
        System.out.println(checkLength(list));//false
        System.out.println();
        System.out.println(checkAnyLength(list));//true
        System.out.println();
        System.out.println(checkNoLength(list));//true
      

	}
	
	/*
	 	1.Functional Programming
	 	Create a method to print list elements which are starting with "A" in Upper cases
	 */
	public static void printElStartA(List<String> list) {
		list.stream().filter(t->t.startsWith("A")).forEach(t->System.out.print(t.toUpperCase() + " "));
	}
	
	 /*
	 	2.Functional Programming
	 	Create a method to print list elements which are starting with "A" or ending "o" in lower cases
	 */
	 public static void printElStartAOrEndingO(List<String> list) { 
		 list.stream().filter(t->t.startsWith("A")||t.endsWith("o")).map(t->t.toLowerCase()).forEach(t->System.out.print(t + " "));	 
	 }
	 /*
	 	3.Functional Programming
	 	Create a method to print the elements in uppercases after ordering according to their lengths
	 	
	 	Note:sorted() method puts the element in natural order
	 		sorted(Comparator.comparing(t->t.length())) method puts the elements in order by using their lengths
	 */
	 public static void sortWithLength(List<String> list) {
		 list.stream().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.length())).forEach(t->System.out.print(t + " "));
	 }
	 /*
	  	4.Functional Programming
	 	Create a method to print the elements in lowercases after ordering according to their last characters
	  */
	 public static void sortWithLast(List<String> list) {
		 list.stream()
		 .map(t->t.toLowerCase())
		 .sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
		 .forEach(t->System.out.print(t + " "));
	 }
	 
	 /*
	  	5. Use “Functional Programming”	
	 	Create a method to print the length of every element in the following format.	  
	 	Sort by length.	  Ali: 3        Mark: 4       Amanda: 6     etc.
	  */
	 public static void printLengthOfEl(List<String> list) {
		 
		 list.stream()
		 .sorted(Comparator.comparing(t->t.length()))
		 .map(t->t + ":" + t.length())
		 .forEach(t->System.out.print(t + ", "));
		 
	 }
	 
	 /*
	  	6. Use “Functional Programming”	
	 	Create a method to print the element if the length is greater than 5.	  
	  */
	 public static void removeLessThanFive(List<String> list) {
		list.stream()
		.filter(t->t.length()>=5)
		.forEach(t->System.out.print(t + " "));
	 }
	 /*
	  	7. Use “Functional Programming”	
	 	Create a method to check if the length of all elements are greater than 3.	  
	  */
	 public static boolean checkLength(List<String>l) {
		 
		return l.stream().allMatch(t->t.length()>3);
		  
	 }
	 
	 /*
	  	8. Use “Functional Programming”	
	 	Create a method to check if the length of any element is 4	  
	  */
	 public static boolean checkAnyLength(List<String> l) {
		 
		return l.stream().anyMatch(t->t.length()==4);
		
	 }
	 /*
	  	9. Use “Functional Programming”	
	 	Create a method to check if the length of No element has length 11	  
	  */
	 public static boolean checkNoLength(List<String> l) {
		 
			return l.stream().noneMatch(t->t.length()==11);
			
		 }
}
