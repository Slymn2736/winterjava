package day02scanner;

public class PostPreIncrementDecrement01 {

	public static void main(String[] args) {
		
		//Post Increment means increase at the end of the statement
		int x = 12;
		System.out.println(x++);
		System.out.println(x);
		
		//Pre Increment means increase before the name of the variable
		System.out.println(++x);
		
		// post Decrement means decrease at the end of the statement
		System.out.println(x--);
		System.out.println(x);
		
		//pre decrement means decrease before the name of the variable
		System.out.println(--x);
		
		System.out.println(x++);
		
		System.out.println(x = x + 1);

	}

}
