package day10forloops;

import java.util.Scanner;

public class ForLoop01PrintEvenInt {

	public static void main(String[] args) {
	//	printEvenInt1();
	//	printEvenInt2();
		printStrRevOrder();
		

	}
	
	/*
	 print all even integers from 100 to 23 on the same line with a space among them
	 */
	
	public static void printEvenInt1() {
		for(int i=100; i>22; i=i-2) {
			System.out.print(i + " ");
		}
	}
	public static void printEvenInt2() {
		for(int i=100; i>22; i--) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		//	System.out.print(i + " ");
		}
	}
	/*
	 Interview Question
	 1.Ask the user to enter a string
	 2.Print the String reverse
	 for example: Germany==>ynamreG
	 */
	public static void printStrRevOrder() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a String to see reverse order");
		String str = scan.nextLine();
		
		for(int i=str.length()-1; i>=0; i--) {
			
			System.out.print(str.charAt(i));
		}
	}


}
