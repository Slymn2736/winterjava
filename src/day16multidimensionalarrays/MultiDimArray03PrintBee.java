package day16multidimensionalarrays;

public class MultiDimArray03PrintBee {

	public static void main(String[] args) {
		
		String arr[] [] = {{"A", "B"}, {"K", "e"}, {"L", "e"} };
		//By using given multi.dim .array, print "bee" in the console
		
		String s = "";
		for(int i = 0; i<arr.length; i++) {
				s = s + arr[i][arr[i].length-1];
			}
			System.out.println(s); //Bee
			
		

	
	int brr[][] = { {32, 12, 11}, {21, 34}, {3} };
	
	int prod = 1;
	
	for(int i=0; i<brr.length; i++) {
		prod = prod * brr[i][0];
	}
	
	System.out.println(prod);//2016
	
	
	}
}	

	
	
