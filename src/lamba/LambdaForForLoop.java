package lamba;

import java.util.stream.IntStream;

public class LambdaForForLoop {
	

	public static void main(String[] args) {
		
		printIntOneToHundred(1, 20);
		System.out.println();
		printInt1To100(1, 20);
		System.out.println();
		System.out.println(sumOfInt(3, 98));
		System.out.println();
		System.out.println(sumOfEvenInt(3, 98));
		System.out.println();
		System.out.println(prodOfOddInt(3, 11));
		System.out.println();
		System.out.println( factorial(9));
		System.out.println();
		System.out.println(prodOfEvenInt(7));
		System.out.println();
		System.out.println(prodOfEvenInt2(7));
		System.out.println();
		System.out.println(sumOfFirstCountNum(23));
		System.out.println();
		System.out.println(prodOddFiveNum(5));

	}

	/*
	 	Print all integers from 1 to 100 without use any loop
	 */
	//1.Use Structured Programming
	public static void printIntOneToHundred(int starting, int ending) {
		System.out.print(starting +" ");
		starting++;
		if(starting<ending+1) {
			printIntOneToHundred(starting, ending);
		}
	}
	//2. Functional Programming
	//In range method 2. parameter is exclusive
	//In rangeClosed method first and second parameter are inclusive
	public static void printInt1To100(int starting, int ending) {
		//IntStream.range(starting, ending+1).forEach(t->System.out.print(t+" "));
		IntStream.rangeClosed(starting, ending).forEach(t->System.out.print(t+" "));
	}
	/*
	 	Find the sum of integers from 3to 98 by using functional programming
	 */
	public static int sumOfInt(int starting, int ending) {
		return IntStream.rangeClosed(starting, ending).sum();		
	}
	
	/*
 	Find the sum of even integers from 3to 98 by using functional programming
 */
	public static int sumOfEvenInt(int starting, int ending) {
		return IntStream.rangeClosed(starting, ending).filter(Utils::checkToBeEven).sum();		
	}
	
		/*
	 	Find the multiplication of odd integers from3 to 11
	 */
	public static int prodOfOddInt(int starting, int ending) {
		return IntStream.rangeClosed(starting, ending)
			.filter(Utils::checkToBeOdd).reduce(1, Math::multiplyExact);	
	}
	
	//Find 9! by using functional programming
	public static int factorial(int num) {
		return IntStream.rangeClosed(1, num).reduce(1, Math::multiplyExact);
	}
	//Find the multiplication of first 7 even counting numbers (2,4,6,8,10,12,14)
	//1.Way: Not recomended
	public static int prodOfEvenInt(int num) {
		return IntStream.rangeClosed(1, 2*num)
			.filter(Utils::checkToBeEven).reduce(1,Math::multiplyExact);
	}
	//2.Way
	public static int prodOfEvenInt2(int num) {
		return IntStream.iterate(2, t->t+2).limit(num)
				.reduce(1, Math::multiplyExact);
	}
	//Find the sum of first 23 odd counting numbers
	public static int sumOfFirstCountNum(int num) {
		return IntStream.iterate(1, t->t+2).limit(num).sum();
	}
	//Find the multiplication of first 5 odd counting numbers which are greater than 6
	public static int prodOddFiveNum(int num) {
		return IntStream.iterate(7, t->t+2).limit(num).reduce(1, Math::multiplyExact);
	}
	
	
	
	
	
	
	
	
	
	
	
}
