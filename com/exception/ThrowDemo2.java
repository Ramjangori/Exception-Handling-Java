package com.exception;

public class ThrowDemo2 {
	 int area(int h , int w) throws Exception {
		 
		 if(h<0 || w<0) {
			 
			 throw new Exception("Area cant calculated please Check Output ");
		 }
		 
		 int c = h*w;
		 return c;
	 }
	
	 
	 int meth(int a, int b)  throws Exception{
		
			 int ar = area(a,b);
			 return ar;	
		
	 }
     public static void main(String[] args) throws Exception  {
    	 ThrowDemo2 d = new ThrowDemo2();
    	 d.meth(10,30);
//    	 try {
//    	  int result = d.area(10,30);
//    	  System.out.println(result);
//    	 }
//    	 catch(Exception e) {
//    		 System.out.println(e);
//    	 }
    	  
    	 System.out.println("Hello ");
	}
}
