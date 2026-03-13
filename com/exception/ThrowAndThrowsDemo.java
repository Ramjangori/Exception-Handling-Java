package com.exception;

public class ThrowAndThrowsDemo {
    
    // Method declaring that it may throw NumberFormatException
    void show() throws NumberFormatException {
        
        // Explicitly throwing an unchecked exception
        throw new NumberFormatException("Invalid Number Format");
    }
    
    
    // This method also declares the exception
    // because it is calling show()
    void hay() throws NumberFormatException {
        
        // Calling show() method
        show();
        
        // This line will not execute
        // because exception is thrown before this
        System.out.println("Hi");
    }

    
    public static void main(String[] args) throws NumberFormatException {
        
        // Creating object of class
        ThrowAndThrowsDemo t = new ThrowAndThrowsDemo();
        
        try {
            // Calling method that throws exception
            t.hay();
        }
        catch(Exception e) {
            // Handling the thrown exception
            System.out.println(e);
        }
        
        // If try-catch is removed,
        // JVM default exception handler will handle it
    }
}