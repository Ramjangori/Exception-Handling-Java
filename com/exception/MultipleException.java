package com.exception;

public class MultipleException {
	public static void main(String[] args) {
		int arr[] = {3,4,5,6,7,8};
		
		try {
			
			int div = arr[1]/0;
			System.out.println(arr[10]);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}  
