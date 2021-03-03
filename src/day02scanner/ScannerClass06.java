package day02scanner;

import java.util.Scanner;

public class ScannerClass06 {
	
	/*
	   Ask user to enter his/her full name
	   Then ask user to enter his spouse's fisrt name
	   Then ask user to enter his adress
	   Then print them all the console.
	 */

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter your full name");
	String fullName = scan.nextLine();
	
	System.out.println("Enter his spouse's first name");
	String spouseFirstName = scan.next();
	
	//After using nextLine() method if you use other method 
	//type "scan.nextLine();" again
	scan.nextLine();
	
	System.out.println("Enter your adress");
	String adress = scan.nextLine();
	
	System.out.println("User Name: " + fullName);
	System.out.println("Spouse Name: " + spouseFirstName);
	System.out.println("Adress: " + adress);
	

	
	scan.close();
	
		
	}

}
