package day09methodoverloadingloops;

public class MethodOverloading01 {

	public static void main(String[] args) {
		
		add(3,5);
		
		add(1.2, 2.3);
		
		add(1.2, 7);
		
		add('a', 'b');

	}
	
	/*
	 Method name and Method parameter are called "Method Signature"
	 In Method Overloading, method signature must be different
	 */
	
	public static void add(int a, int b) {
		System.out.println("int and int " + (a+b));
	}
	
	
	public static void add(double a, double b) { //
		System.out.println("double and double " + (a+b)); 
	}

		
	public static void add(double a, int b) {
		System.out.println("double and int " + (a+b));
	}
		
	public static void add(char a, char b) {
		System.out.println("char and char " + (a+b));				
	}
			
			
}

