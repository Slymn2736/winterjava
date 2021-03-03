package day03wrapperclassconcatenatelogicaloperators;

import java.util.Scanner;

public class ModulusOperator01 {
	

	public static void main(String[] args) {
		
		/*
		  Ask user to enter 3 digit integer.
		Type a program to find the sum of the digits
		For example; 438 ==> 4+3+8 = 15
		  */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter 3 digit integer");
		int num = scan.nextInt();
		
		int c = num%10;
		
		int num1 = num/10;
		int b = num1%10;
		
		int a = num/100;
		
		
		int sum = a + b + c;
		
		System.out.println("The sum of digits is : " + sum);
		
		
		scan.close();
		
		

	}

}
