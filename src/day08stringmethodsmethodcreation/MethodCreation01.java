package day08stringmethodsmethodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		System.out.println(add(3, 5));
		System.out.println(add(12.32, 21.12345));
		
		
	
		
		
	}
	/*
	 1) We create methods out of the main method and use them in main method to make main method simple
	 2) The variables which are created in method parenthesis are called “parameters” ==> For example num1 and num2
	 	The values which are used in method call are clled “arguments” ==> For example 3, and 5
	 3) To call a method from inside the main method, use just method name + method parenthesis + arguments
	 4) “static” methods can use just static class members, because of that if you will call a method from inside the
	 	 main method you have to make it “static”
	 5) for number parameter you can use chars but do not use "String" or "boolean" otherwise you get compile time error.
	 */
	
	/*
	 If you need to you use same name method name in methods in A CLASS, you have to make parameters different.
	 there are 3 ways to make parameters
	 1) Change data type of parameters
	 2)Change the number of parameters
	 3) if the data types of parameters are different you may change their order
	 
	 Note for Interview:
	 Method Overloading: if you create methods whose names are same, parameters are different in a class it is called Method Overloading.
	 
	 Note: When you same name for methods in a class, Java complains. to stop complaining you have to change parameters.
	 		Changing"return type" cannot stop complain
	 		Changing "access modifier" cannot stop complain
	 		Removing or adding "static" keyword cannot stop complain
	 */
	
	
	
	public static double add(double num1, double num2) {
		return num1 + num2;
	}

	public static double add(int num1, char num2) {
		return num1 + num2;
	}
	
	public static double add(char num1, int num2) {
		return num1 + num2;
	}
	public static double add(int num1, char num2, int num3) {
		return num1 + num2 + num3;
	}
	
	
}
