package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop03Password {

	public static void main(String[] args) {
		printPassword();

	}
	/*
	 Ask user to enter password.
		 If the password has more than 6 characters print “It is okay”
		 Otherwise, print “Make the password longer than 6 characters” 
		 and ask user to enter a new password
	 */
	public static void printPassword() {
		Scanner scan = new Scanner(System.in);
		String pswd = "";
		
		do {
			System.out.println("Enter password");
			pswd = scan.nextLine();
			
			if(pswd.length()>6) {
				System.out.println("Password is valid");
			}else {
				System.out.println("Make the password longer than 6 character");
			}
		}while(pswd.length()<=6);
		
	scan.close();
	}
	
}
