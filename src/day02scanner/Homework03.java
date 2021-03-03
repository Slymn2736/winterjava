package day02scanner;

import java.util.Scanner;

public class Homework03 {
	
	/*
	 * Type a program which converts the mile to kilometer. Mile value will be
	 	entered by user. (Use double)
		Hint 1: km = mile x 1.6
		Hint 2: To get double, use nextDouble()
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter mile value");
		double mile = scan.nextDouble();
		
		System.out.println("Mile equal to " + (mile * 1.6) + "km");
		
		
		scan.close();
	}

}
