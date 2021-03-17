package day25overridingexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02 {
	/*
	 1)Exception are unexpected errors in Java
	 2)Exceptions can handle by using try-catch blocks
	 3)ArithmeticException is thrown by Java in Run Time if there is any issue in Mathematical Operations
	 4)FileNoteFoundException occurs in Compile Tie, if there is any issue in the path of the file or in the
	 	existence of the file.
	 */

	public static void main(String[] args) {
		FileInputStream fis = null;
		

		try {
			fis = new FileInputStream("\\Users\\gulsl\\eclipse-workspace\\Java Lessons\\winterjava\\src\\day25overridingexceptions\\FileForExc");
		}catch(FileNotFoundException e) {
			System.out.println("The file is deleted or the path is wrong");
		}
	}

}
