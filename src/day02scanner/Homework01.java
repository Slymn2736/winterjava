package day02scanner;

import java.util.Scanner;

public class Homework01 {
	
	/*
	 Type a program which calculates the area and the perimeter of a circle
		whose radius is entered by user. (Use float)
		Hint 1: Take pi number as 3.14159
		Hint 2: Area of a circle is 3.14159 x radius x radius
		Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
		Hint 4: To get float, use nextFloat()

	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter the radius of the circle");
		float radius = scan.nextFloat();
		float pi = 3.14159f;
		
		System.out.println("Area of a circle is " + pi * radius * radius);
		System.out.println("Primeter of a circle is " + 2 * pi * radius);
		
		scan.close();
	
	}
		

	}


