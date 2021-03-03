package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class Ternary01 {
	
	/* 
	 * 1. Question:
	 Type java code by using ternary and if-else, ask user to enter an integer, 
	 if the integer is even,  output will be “The integer is even”.
	 If the integer is odd, the output will be “The integer is odd”.
	 */
	
	/* 
	 * 2. QUestion:
	Type java code by using ternary .
	Ask user to enter two integers
	Write a program to print the minimum one on the console.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer...");
		int a = scan.nextInt();
		
		
		// 1. Question
		//Condition  Question Mark     Code will be excuted if the condition is true  colon    Code will be excuted if the condition is false
		//   a%2==0      ?                   "The integer is even"                        :               "The integer is odd";
		
		String result1 = a%2==0 ? "The integer is even" : "The integer is odd";	
		System.out.println(result1);		
		
		//2. Question
		System.out.println("Enter 2 integers");
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int result2 = b>c ? c : b;
		System.out.println("The minimum is " + result2);
		
		scan.close();
		
				
	}

}
