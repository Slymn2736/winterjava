package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement04 {

	public static void main(String[] args) {
		/*
		Type java code by using if-else if() statement,
		if both of the two integers are positive, output will be the sum of them.
		If both of the two integers are negative, output will be the multiplication of them.
		Otherwise; output will be “I cannot add or multiply different signed numbers”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two integers...");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		if(n1>0 && n2>0) {
			System.out.println("The sum of " + n1 + " and " + n2 + " is " + (n1 + n2));
		}else if(n1<0 && n2<0) {
			System.out.println("The multiplication of " + n1 + " and " + n2 + " is " + (n1 * n2));	
		}else if(n1 == 0 && n2 == 0){
		System.out.println("The sum and multiplication of " + n1 + " and " + n2 + " is " + (n1 + n2));
		}else{
		
			System.out.println("I cannot add or multiply different signed numbers");
		}
		scan.close();
		}
	
	}


