package day22stringbuilderencapsulation;

public class StringBuilder02 {
	/*
	 In StringBuilder we use append(), In String we use "concat()" or "+"
	 */

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		
		long startingTimeSb = System.nanoTime();
		for(int i = 0; i<1000; i++) {
			sb1.append("abc");
		}

		long endingTimeSb = System.nanoTime();
		System.out.println(endingTimeSb - startingTimeSb);
		
		long startingTimeStr = System.nanoTime();
		String str1 = new String();
		for(int i = 0; i<1000; i++) {
			str1.concat("abc");
		}
		long endingTimeStr = System.nanoTime();
		System.out.println(endingTimeStr - startingTimeStr);
	}

}
