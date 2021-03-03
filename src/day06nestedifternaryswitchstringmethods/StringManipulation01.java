package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class StringManipulation01 {
	/*
	 STring Methods:
	 1) toUpperCase() 2) toLowerCase() 3) charAt() 4) equals() 5 ) equalsIgnoreCase() 6) length()
	 7)next() 8) nextLine() 9) indexOf() 10) lastIndexOf()  11) contains()
	 */

	public static void main(String[] args) {
		
		
	
		 String str = "Java is easy if you study"; 
		 
		 //9indexOf() returns the index of first occurence of the character
		 System.out.println(str.indexOf("i"));//5
		 //indexOf() accepts char as parameter as well
		 System.out.println(str.indexOf('i'));//5 
		 // if the character does not exist in the String it returns "-1" 
		 System.out.println(str.indexOf("x"));//-1 
		 // if you put multiple character it return with fist character
		 System.out.println(str.indexOf("easy"));//8 
		 // if you use indexOf() with two parameter, Java look for the character after the given index, 
		 // second parameter is inclusive 
		 System.out.println(str.indexOf('i',8)); //13
		 	 	
		
		/*
		 Ask user to enter a String and character, then check if the String has the character or not
		 */
		
		
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Please enter a String the enter a character"); 
		  String s =scan.next(); 
		  char ch = scan.next().charAt(0);
		  
		 String result = s.indexOf(ch)==-1 ? "The String has no the character" :"The String has the character"; 
		 System.out.println(result);
		 
		 
		
		//10lastIndexOf() returns the index of last occurence of the character
		
		 String t = "Java ah Java"; 
		//in lastIndexOf() method you can use char and String. 
		 System.out.println(t.lastIndexOf('a'));//11
		 
		 System.out.println(t.lastIndexOf("a"));//11 
		 // lastIndexOf() return -1 if the character doesn't exist in the String
		 System.out.println(t.lastIndexOf('w'));//-1 
		 // lastIndexOf() returns the index of first character of the last occurence of "Java"
		 System.out.println(t.lastIndexOf("Java"));//8 
		 // if you use lastIndexOf() with 2 parameters get the character starting with the index and to the begining of the String.
		 // In the following example we are use "Java a"
		 System.out.println(t.lastIndexOf('v', 5));//11
		 		
		 
		/*
		Ask user to give you a String and a character.
		If the character does not exist in the String or exists just one print "Not good!"
		if the character is used multipe times print "Wooow!"
		
		 */
		
		 System.out.println("enter a string the enter a character"); 
		 String v =scan.nextLine(); 
		 char ch1 = scan.next().charAt(0);
		 
		 if(v.indexOf(ch1)==-1 || v.indexOf(ch1)==v.lastIndexOf(ch1)) {
		 System.out.println("Not good!"); } 
		 if(v.indexOf(ch1) != v.lastIndexOf(ch1)) {
		 System.out.println("Woow!"); }
		 
	//11) contains() is used to check if a single character or multiple characters exist in a String
		String r = "Learn Java, earn money";
		r.contains("e");//true
		System.out.println(r.contains("e"));//true
		System.out.println(r.contains("x"));//false
		System.out.println(r.contains("earn"));//true
		
		scan.close();
	
	}

}
