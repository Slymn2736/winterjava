package day27exceptions;

import java.util.Scanner;

public class Exc02 {
	/*
	 Get a String from user
	 	Convert it to an integer
	 	Return the integer after multiplying by 2
	 	Your code should not be blocked for any String
	 	
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a String");
		String str = scan.nextLine();
		System.out.println(convertStringToInt( str));
		
		scan.close();
	}
	public static int convertStringToInt(String str) {
		
	
		int a=0;
		
		try {
			a = Integer.parseInt(str);
			
		}catch(NumberFormatException e) {
			System.out.println(str + " Cannot be converted to Integer");
		}

		return 2*a;
	}
}
