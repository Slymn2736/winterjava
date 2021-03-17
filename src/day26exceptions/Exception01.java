package day26exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception01 {
	
	/*
	 1) There are 2 main type exceptions;
	 	a) Compile Time Exceptions (Checked Exceptions)
	 	b) Run Time Exception (Unchecked Exceptions)
	 2)After try block you can use 1 or more catch blocks
	 3) try blocks cannot be used alone
	 4)When you use multiple catch block, make the child exception classes first
	 */
	
	/*
	 What is the meaning of "platform independent"?
	 */

	public static void main(String[] args) {
		FileInputStream fis = null;
		//1.WAY:
		//You may use nested try-catch block
		/*
		 * try { fis = new
		 * FileInputStream("\\Users\\gulsl\\eclipse-workspace\\Java Lessons\\winterjava\\src\\day26exceptions\\FileForExc"
		 * ); int k=0; try { while ((k = fis.read()) !=-1) { System.out.print((char) k);
		 * } } catch (IOException e) { System.out.println("File could not be read");
		 * 
		 * }
		 * 
		 * } catch (FileNotFoundException e) {
		 * System.out.println("File is deleted or path is wrong"); }
		 */
		
		//2. WAY:
		try {
			fis = new FileInputStream("\\Users\\gulsl\\eclipse-workspace\\Java Lessons\\winterjava\\src\\day26exceptions\\FileForEx");
			
			int k = 0;
		
			while((k = fis.read()) != -1) {
				
				System.out.print((char)k);
				
			}
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File is deleted or path is wrong" + e.getMessage());
			
		}catch(IOException e) {
			System.out.println("File could not be read");
		}
	

	}
}
