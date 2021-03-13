package day20passbyvaluepassbyreferencedate;

public class Varargs01 {
	/*
	 1)If you want a method to run with different number arguments use varargs
	 2)Varargs behaves like list but behind the varargs arrays work
	 3)To declare a varargs use "int ...a" or "String...s" etc.
	 4)Varargs must be last parameter inside the method 
	 5) Can I use multiple varargs inside a method parenthesis? NO
	 
	 */

	public static void main(String[] args) {
		System.out.println(add(-2,17));
		
		System.out.println(retirementPeyment("Mary Stone", 2,3,5,6));
		
	}

	public static int add(int ...a) {
		int sum = 0;
		
		for(int w : a) {
			sum = sum + w;
		}
		
		return sum;
	}
	
	public static String retirementPeyment(String empName, int... amount) {
		int result = 1;
		
		for(int w : amount) {
			result = result * w;
		}
		
		return empName+ " : " +result;
		
	}
	
	
}
