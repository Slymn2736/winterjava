package day03wrapperclassconcatenatelogicaloperators;

public class Concatenation01 {

	public static void main(String[] args) {
		
		/*
		 Concatenation: It joints two or more String
		 */
		
		String s = "Java";
		String t = "is easy";
		System.out.println(s + " " + t);
		
		
		int a = 3;
		int b = 4;
		String s1 = "Java";
		System.out.println(a + s1);
		
		System.out.println(s1 + a);
		
		System.out.println(a + s1 + b);
		
		System.out.println(s1 + a + b);
		
		System.out.println(s1 + (a +b));
		
		System.out.println(a + b + s1);
		
		
		//By usin f d,e,f print 61Java-1 on the console.
		int d = 2;
		int e = 3;
		String f = "Java";
		
		System.out.println("" + (d*e)+ (e - d) + f + (d - e));
		
		System.out.println((e*d)+((e-d)+f) + (d-e));
		
		
		
		
	}

}
