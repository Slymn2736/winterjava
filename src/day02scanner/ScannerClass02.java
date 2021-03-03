package day02scanner;

import java.util.Scanner;

public class ScannerClass02 {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please, enter the length of the side of the square");
		
		double length = scan.nextDouble();
		
		System.out.println("Area: " + length * length);
		
		System.out.println("Parmiters: " + 4 * length);
		
		scan.close();
		
		}

}
