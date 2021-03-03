package day04ifelse;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		
		
		/*
	     Type java code by using if statement
	     When you enter the name of the day a week, 
	     output will be "Weekday" or "Weekend day" according to the name of the day
	     Get the name of the name from user
	     */
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the name of a day");
		String dayName = scan.next().toLowerCase();
		
		if(dayName.equals("monday") || dayName.equals("tuesday") || dayName.equals("wednesday") ||
				dayName.equals("thursday") || dayName.equals("friday")) {
			System.out.println("Weekday");
		}
		
		if(dayName.equals("saturday") || dayName.equals("sunday")) {
			System.out.println("Weekend");
		}
		
		if( !dayName.equals("monday") && !dayName.equals("tuesday") &&!dayName.equals("wednesday") &&
			!dayName.equals("thursday") && !dayName.equals("friday") && !dayName.equals("saturday") &&
			!dayName.equals("sunday")); {
					System.out.println("Enter a valid day name");
				}
				
				
		scan.close();
		}
		
		

	}

