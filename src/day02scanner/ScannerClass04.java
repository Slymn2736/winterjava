package day02scanner;

import java.util.Scanner;

/*
 Type a program which calculates the volume of a rectangular prism
whose length, with, and height are entered by user.
Hint 1: Volume of a rectangular prism is width x length x height
 */

public class ScannerClass04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please, enter the length of prism");
		double length = scan.nextDouble();
		
		System.out.println("Please, enter the width of prism");
		double width = scan.nextDouble();
		
		System.out.println("Plese, enter the height of prism");
		double height = scan.nextDouble();
		
		System.out.println("Volume: " + (length*width*height));
		
		scan.close();

	}

}
