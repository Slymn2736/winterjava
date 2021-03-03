package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class Ternary03 {
	
	/*
	Ask user to enter an integer. If the number has 3 digits, output will be
	“This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
	How can you decide the number of digits of an integer?
	 */

	/*
	Ask user to enter a String. If the String has 2 characters, output will be
	“It is valid for state abbreviations” 
	Otherwise, output will be 
	“It is not valid for state abbreviations”
	 */
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		// 1. Question
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		
		String result1 = (a>99 && a<1000) || (a<-99 && a>-1000) ? "The number has 3 digits" : "The number has no 3 digits";
		System.out.println(result1);
			
		//2. Question	
		System.out.println("Enter the abbreviation of a state...");
		String abrv = scan.next();
		
		String result2 = abrv.length()==2 ? "It is valid for state abbreviations" : "It is nor valid for state abbreviations";
		System.out.println(result2);
			
		scan.close();
	}

}
