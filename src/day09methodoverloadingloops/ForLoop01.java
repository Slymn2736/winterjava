package day09methodoverloadingloops;

public class ForLoop01 {
	/*
	  Type code to print "Hello World!" 10 times on the console...
	 */

	public static void main(String[] args) {
		printHello();	
	//	printInteger();
		//printNum();
		
		}
	
	public static void printHello() {
		
		for(int i = 1; i<=10; i++) {
			System.out.println("Hello World!");
	}

		
		
		
}
	
	/*
	 type code to print integers from 5 to 12 on the console
	 */
	
	public static void printInteger() {
		
		for(int i=5; i<8; i++) {
			System.out.print(i + " ");
		}
		
	}
	
	/*
	 Type code to print integer from 12 to 5 on the console
	 */
	public static void printNum() {
		for(int i=12; i>=5; i--) {
			System.out.print(i + " ");
		}
	}
	
	
	
}
