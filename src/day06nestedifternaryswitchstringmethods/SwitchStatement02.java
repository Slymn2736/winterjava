package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class SwitchStatement02 {
	/*
	   If the user pressed 1, 2, 3 the program will print the number that is pressed; 
    otherwise, program will print “Not allowed”.
	 */


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please press a number");
		int num =scan.nextInt();
		
		switch (num) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			default :
				System.out.println("Not allowed");
				
		}
		
		scan.close();	
	}

}
