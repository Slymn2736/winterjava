package day11whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01SumOfDigits {

	public static void main(String[] args) {
		sumOfDigits();

	}
	/*
	 Interview Question
	 Type java code by using while loop,
         Write a program that prompts the user to input an integer.
         It should then find sum of the digits of that number.
         	123 ==> 1+2+3 = 6
	 */
	public static void sumOfDigits() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer...");
		int num = scan.nextInt();
		
		int originalNum = num;
		
		int sum = 0;
		if(num<0) {    //for the negative numbers
			num = num*(-1);
		}
		while(num!=0) {
			sum = sum + num%10;
			num = num / 10;
		}
		System.out.println("The sum of th digits of "+ originalNum + " is " + sum);
		
		scan.close();
	}
	
}
