package day02scanner;

import java.util.Scanner;

public class ScannerClass07 {
	
	/*
	 User will enter his first name you will print the first character on the console
	 User will enter his last name you will print the first character on the console
	 */

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		char firstNameInitial = scan.next().charAt(0);
		
		System.out.println("Enter your last name");
		char lastNameInitial = scan.next().charAt(0);
		
		
		System.out.println("Initial of the first name is " + firstNameInitial);
		System.out.println("Initial of the last name is " + lastNameInitial);
		
		/*
		 If you use mathematical operations for chars, Java uses the ASCII values of chars.
		 If you want to print chars on the as characters not ASCII values there are 2 options;
		 1) Use String together with chars.
		 2)Use System.ou.print()
		 
		 Note: System.out.println() prints the output then goes to the next line
		 */
		//1.Way
		System.out.println("" + firstNameInitial + lastNameInitial);
		
		//2.Way
		System.out.print(firstNameInitial);
		System.out.print(lastNameInitial);
		
		scan.close();
	}

}
