package day02scanner;

public class IncrementDecrement01 {

	//Increment: if you increase the value of a variable, then this process is called
	//				as "Increment"
	
	public static void main(String[] args) {
		
		int num1 = 5;
		System.out.println("Before Increment " + num1);
		
		//Increase the value of num1 by 3.
		//1.Way
		num1 = num1 + 3;
		System.out.println("After Increment " + num1);
		
		//2.Way
		num1 += 3;
		System.out.println("After Increment " + num1);
		
		//3.Way: This way can be used just to increase by 1
		num1++; //means num1+=1; or num1 = num1 + 1
		System.out.println("After Increment " + num1);
		
		//Note: Increment can be done by multiplication as well
		num1 = num1 * 2;
		System.out.println("After multiplication " + num1);
		
		num1*=2;
		System.out.println("After Multiplication " + num1);
		
		//Decrease the num1 by 2
		//1.Way:
		num1 = num1 -2;
		System.out.println("After Decrement " + num1);
		
		//2. Way
		num1-=2;
		System.out.println("After Decremnet " + num1);
		
		//3.Way: This way can be used just decrease by 1
		num1--;
		System.out.println("After Decremnet " + num1);
		
		//Note: Decrement can be done by division as well
		num1 = num1 /2;
		System.out.println("After division decrement " + num1);
		
		num1 /= 3;
		System.out.println("After division decrement " + num1);
		
		

	}

}
