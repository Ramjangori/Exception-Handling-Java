package com.exception;
// Try - Catch block 


public class ExceptionHandle2 {
    public static void main(String[] args) {
		int a = 10; 
		int b = 0;
		
		try {
			int c = a/b; // Unchecked Exception 
			System.out.println(c);
		}
		catch(Throwable t) {
			System.out.println("Some problem Occure ");
			
		}
	}
}


