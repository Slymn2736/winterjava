package day12dowhileloop;


import java.util.Scanner;

public class DoWhileLoop01PrintEvenInt {

	public static void main(String[] args) {
		CheckEven();

	}
	/*	Ask user to enter an integer
    If the integer is even print on the console �You won!�
	 Otherwise ask user to enter another integer
	 */
	public static void CheckEven() {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		
		do {
			System.out.println("Please enter an integer");
			num = scan.nextInt();
			if(num%2==0) {
				System.out.println(num + " is even so you won!");
			}
			
			
		}while(num%2!=0);
	
		scan.close();
	}


}
