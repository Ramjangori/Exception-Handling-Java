package com.exception;
class OutOfStockException extends RuntimeException{
	public OutOfStockException(String message) {
		super(message);
	}
}

public class CustomException2 {
	
	 static boolean inStock = true;
	static public void  Order(String product ) {
		  if(inStock==false) {
			  throw new OutOfStockException("Out of Stock Product..");
		  }
		  System.out.println("Order Sucessfully ..");
	}
	
	public static void main(String[] args) {
		CustomException2.Order("Shoes");
	}

}
