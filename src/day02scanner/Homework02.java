package day02scanner;

import java.util.Scanner;

public class Homework02 {
	
	/*
	 Type a program which calculates the perimeter of a triangle whose
		Side lengths are entered by user. (Use byte)
		Hint 1: Perimeter of a triangle is a + b + c
		Hint 4: To get byte, use nextByte()

	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter the lengths of triangle");
		System.out.println("Enter a ");
		byte a = scan.nextByte();
		System.out.println("Enter b ");
		byte b = scan.nextByte();
		System.out.println("Enter c ");
		byte c = scan.nextByte();
		
		System.out.println("Perimeter of a triangle is " + (a + b + c));
		
		scan.close();
	}

}
