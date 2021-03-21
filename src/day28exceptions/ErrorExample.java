package day28exceptions;

public class ErrorExample {
	
	/*
	  Errors cannot be handled but Exceptions can be.
	  Error Example; out of Memory error, Stack over flow error, Crash memory error.
	 */

	public static void main(String[] args) {
		for(int i=0; i<3; i--) {
			System.out.println(i + " ");
			Object obj = new Object();
		}

	}

}
