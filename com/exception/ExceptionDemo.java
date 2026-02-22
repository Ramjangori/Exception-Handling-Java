package com.exception;

 /*
  * java.lang.Object
        ↓
java.lang.Throwable
        ├── 1️⃣ Error
        │       ├── VirtualMachineError
        │       ├── OutOfMemoryError
        │       ├── StackOverflowError
        │       └── AssertionError
        │
        └── 2️⃣ Exception
                ├── A. Checked Exceptions (Compile-Time)
                │       ├── IOException
                │       │       ├── FileNotFoundException
                │       │
                │       ├── SQLException
                │       ├── ClassNotFoundException
                │       └── InterruptedException
                │
                └── B. Unchecked Exceptions (Runtime)
                        ├── ArithmeticException
                        ├── NullPointerException
                        ├── ArrayIndexOutOfBoundsException
                        ├── NumberFormatException
                        ├── ClassCastException
                        └── IllegalArgumentException

  * */
public class ExceptionDemo {
    private char[] b;

	public static void main(String[] args) {
		
		
//		int a = 10;
//		int b=0;
//		// Airthmatic Exception 
//		try {
//			int c = a/b;
//			System.out.println(c);
//		}
//		catch(Exception e){
//			System.out.println(e);
//		}
		// ArrayIndexOutOfBoundsException
//		int arr[] = {4,5,6,7,3};
//		try {
//			System.out.println(arr[10]);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		
		// NullPointerException
//    	int b = 10;
//    	ExceptionDemo demo = null;
//    	try {
//    		System.out.println(demo.b);
//    	}
//    	catch(Exception e){
//    		System.out.println(e);
//    	}
		
		// NumberFormatException
//		String s = "Ramjan";
//		try {
//			Integer i = Integer.parseInt("s");
//
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		
    	//  IllegalargumentException 
		
		
		
	}
	
}
