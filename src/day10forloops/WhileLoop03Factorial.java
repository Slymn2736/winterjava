package day10forloops;

import java.util.Scanner;

public class WhileLoop03Factorial {

	public static void main(String[] args) {
		factorial();

	}
	/*
	 Get an integer from user and calculate the factorial
	 user --> 5==> 5!=120
	 */

	public static void factorial() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int d = scan.nextInt();
		
		int i = 1;
		int result = 1;
		while(i<=d) {
			
			result = result *i;
			
			i++;
		}
		
		System.out.println(result);
		
		scan.close();
	}
}
