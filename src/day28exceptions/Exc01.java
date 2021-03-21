package day28exceptions;

public class Exc01 {
	/*
	 1) "finally" is used in "try catch"
	 2) "finally block" is executed under every condition
	 3) "finally block" is used to end connection with cloud, to end connection database
	 4) "finally block" can be used without "catch"
	 Note: try block can be used like; a) try + catch b) try + multiple catch c) try + finally 
	 								   d) try+ catch +finally e) try + multiple catch + finally
	 
	 */

	public static void main(String[] args) {
		div(12, 0);

	}
	public static void div(int a, int b) {
		
		try {
			
		
		System.out.println(a/b);
		
		}catch(ArithmeticException e) {
			System.out.println("Do not use zero for the second parameter...");
			
		}finally {
			System.out.println("Do you want to do more operations...");
		}
	
	
	}
	
}
