package day10forloops;

public class WhileLoop01 {

	public static void main(String[] args) {
		 printOddInt();
		// System.out.println();
	//	 printOddInt2();
	//	 printInt();

	}
/*
 Type a program to print odd integers from 4 to25 on the console
 1 use for loop
 2
 */
	
	public static void printOddInt() {
		
		//For Loop
		for(int i=4; i<10; i++) {
			if(i%2!=0) {
				System.out.print(i + " ");
			}
		}
	}
	
	//While Loop
	public static void printOddInt2() {
		int i = 4;
		while(i < 10) {
			if(i%2!=0) {
			System.out.print(i + " ");
			
			}
			i++;
	}
	
	}
	/*
	 Create a method to print integers which are divisible 6 and 8 from 500 to 25
	 */
	public static void printInt() {
		int i = 500;
		while (i >=25) {
			if(i%6==0 && i%8==0) {
				System.out.print(i + " ");
			}
			// Do not forget to type increment, otherwise it will be infinite loop
			i--;
		}
	}
	
	
}
