package com.exception;
/*
============================================================
            EXCEPTION HANDLING NOTES (Interview Level)
============================================================

1) What is Exception?
   An unwanted event that disrupts normal program execution.

2) Exception Hierarchy:

        Throwable
           |
    -----------------
    |               |
   Error         Exception
                      |
            ---------------------
            |                   |
     Checked Exception     RuntimeException
                                |
                        Unchecked Exception

------------------------------------------------------------
3) Types of Exceptions
------------------------------------------------------------

A) Checked Exception (Compile-Time)
   - Verified at compile time
   - Must handle using try-catch OR throws
   - Directly or indirectly extends Exception
   - Example: IOException, SQLException

B) Unchecked Exception (Runtime)
   - Occurs at runtime
   - Not checked by compiler
   - Extends RuntimeException
   - Example: ArithmeticException, NullPointerException

------------------------------------------------------------
4) Exception Handling Blocks
------------------------------------------------------------

try      -> risky code
catch    -> handles exception
finally  -> always executes (except System.exit())

Rules:
✔ try must be followed by catch or finally
✔ Multiple catch blocks allowed
✔ Order: Child exception first, Parent later
✔ Nested try is valid
✔ Only one exception handled at a time
✔ finally block always executes

============================================================
                 PRACTICAL PROGRAMS
============================================================
*/

public class ExceptionHandleDemo {

    public static void main(String[] args) {

        System.out.println("===== Basic Try-Catch =====");
        basicTryCatch();

        System.out.println("\n===== Multiple Catch =====");
        multipleCatch();

        System.out.println("\n===== Nested Try-Catch =====");
        nestedTryCatch();

        System.out.println("\n===== Finally Block Demo =====");
        finallyDemo();
    }


    // 1) Basic Try-Catch
    static void basicTryCatch() {
        try {
            int a = 10 / 0;  // ArithmeticException
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Handled");
        }
    }


    // 2) Multiple Catch Example
    static void multipleCatch() {
        try {
            int arr[] = new int[3];
            arr[5] = 10;  // ArrayIndexOutOfBoundsException
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception Handled");
        } 
        catch (Exception e) {
            System.out.println("General Exception Handled");
        }
    }


    // 3) Nested Try-Catch Example
    static void nestedTryCatch() {
        try {

            System.out.println("Outer Try Start");

            try {
                int x = 10 / 0;  // ArithmeticException
            } 
            catch (ArithmeticException e) {
                System.out.println("Inner Catch Executed");
            }

            int arr[] = new int[2];
            arr[4] = 100;  // ArrayIndexOutOfBoundsException

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Catch Executed");
        }
    }


    // 4) Finally Block Demo
    static void finallyDemo() {
        try {
            int a = 10 / 2;
            System.out.println("Try Executed");
        } 
        catch (Exception e) {
            System.out.println("Catch Executed");
        } 
        finally {
            System.out.println("Finally Always Executes");
        }
    }
}
