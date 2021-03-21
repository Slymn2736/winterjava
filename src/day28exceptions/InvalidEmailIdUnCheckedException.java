package day28exceptions;

/*
 To create an unchecked exception, extend to RuntimException class
 */
	public class InvalidEmailIdUnCheckedException extends RuntimeException {

	
		private static final long serialVersionUID = 1L;

		 InvalidEmailIdUnCheckedException(String message) {
			 super (message);
	}

}
