package day10forloops;

public class ForLoop03 {

	public static void main(String[] args) {
		sumOfAllInt();

	}
	/*
	 Find the sum of all integers from 10 to 200
	 */
	public static void sumOfAllInt() {
	
		int sum = 0;
		for(int i=10; i<200; i++) {
			sum = sum + i; //sum +=i
			//if you want to the sum value for every loop, put System.out.prinln(sum) inside the for loop
			//System.out.println(sum);
	}
		//If you type System.out.prinln(sum) after the for loop it will display the final value of sum
		System.out.println(sum);
	}
	
	
}
