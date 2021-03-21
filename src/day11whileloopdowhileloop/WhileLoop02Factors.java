package day11whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop02Factors {

	public static void main(String[] args) {
		factors();

	}
	/*
	 Type java code by using while loop,
         Write a program to count the factors of an integer which is entered by user.
         Factors of 12 = 1, 2, 3, 4, 6, 12
	 */
	
	public static void factors() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer...");
		int number = scan.nextInt();
		
		if(number<0) {
			number = -number;
		}
		
		int i = 1;
		
		while(i<=number) {
			
			if(number%i==0) {
				System.out.print(i + " ");
			}
			
			i++;
		}
		
		
		
	}
}
