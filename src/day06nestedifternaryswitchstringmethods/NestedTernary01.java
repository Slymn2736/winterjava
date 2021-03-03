package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class NestedTernary01 {

	
	/*
	 Ask user to enter an integer
	 if the integer is not negative then check if it is less than 10 return "The integer is digit"
	 I the integer is negative return "Negative cannot be a digit"
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		
		String result = (a>=0) ? (a<10? "The integer is digit" : "The integer is not a digit") : ("Negative cannot be a digit");
		System.out.println(result);
	
	scan.close();
	}
	

}
