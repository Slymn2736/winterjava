package day28exceptions;

/*
 	1) Name the class by using "Exception" word at the end
 		Using exception word at the end is not must but it is naming convention
 	2) To crate a 
 */

public class InvalidEmailIdCheckedException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public InvalidEmailIdCheckedException(String message) {
		super (message);
	}
	
}
