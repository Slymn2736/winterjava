package day11whileloopdowhileloop;

public class DoWhileLoop01 {

	public static void main(String[] args) {
		
		
		int  i = 1;
		
		
		//Type a code by using while loop
		while(i>1) {
			System.out.println("Hello");
		}
		
		//Type a code by using do-while loop
		
		do {
			System.out.println("Hello Do While Loop");
		}while(i>1);
		
		printOddInt();
		
		/*
		 Note 1: While loop checks the condition first then execute the code in loop body
		 		do-while loop executes the code first then checks the condition
		 Note 2: while loop is executed at least once while loop is possible not to be executed
		 */
	}
	
	/*
	 Create a method to print odd integers less then 100 by using do while loop
	 */
	public static void printOddInt() {
		
		int i = 1;
		do {
			if(i%2!=0) {
				System.out.print(i + " ");
			}
			i++;
		}while(i<100);
		
	}

	
	
	

}
