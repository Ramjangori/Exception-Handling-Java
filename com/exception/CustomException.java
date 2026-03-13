package com.exception;

// -----------------------------
// Unchecked Custom Exception
// Extends RuntimeException
// No need to declare using throws
// -----------------------------
class InvalidAgeException extends RuntimeException {

    // Constructor to pass custom message to parent class
    public InvalidAgeException(String message) {
        super(message);
    }
}

// -----------------------------
// Checked Custom Exception
// Extends Exception
// Must be handled OR declared using throws
// -----------------------------
class LowQuantityException extends Exception {

    // Constructor to pass custom message
    public LowQuantityException(String message) {
        super(message);
    }
}

// -----------------------------
// Another Unchecked Exception
// Used for business logic failure
// -----------------------------
class InsufficientBalance extends RuntimeException {

    public InsufficientBalance(String message) {
        super(message);
    }
}

public class CustomException {

    // -----------------------------
    // Method to validate age
    // Throws unchecked exception
    // No need to declare throws
    // -----------------------------
    static void checkAge(int age) {

        // Business rule validation
        if (age < 18) {
            // Throwing custom runtime exception
            throw new InvalidAgeException("Age should Greater than 18");
        }

        System.out.println("You can cast vote..");
    }

    // -----------------------------
    // Method to validate order quantity
    // Throws checked exception
    // Must declare throws
    // -----------------------------
    static void checkOrder(int qty) throws LowQuantityException {

        if (qty <= 500) {
            // Throwing checked exception
            throw new LowQuantityException("Quantity must be Greater than 500");
        }

        System.out.println("Order successfully Placed..");
    }

    // -----------------------------
    // Method to withdraw money
    // Uses unchecked exception
    // -----------------------------
    public static void withdrowMoney(int money) {

        int balance = 1000;

        if (money > balance) {
            // Throwing custom runtime exception
            throw new InsufficientBalance("Insufficient Money In your account");
        }

        System.out.println(money + " Withdraw Successfully");
    }

    // -----------------------------
    // Main Method
    // Declares throws InvalidAgeException
    // (Not required because it is unchecked)
    // -----------------------------
    public static void main(String[] args) throws InvalidAgeException {

        // Calling age validation
        CustomException.checkAge(44);

        // Handling checked exception using try-catch
        try {
            CustomException.checkOrder(200);
        }
        catch (Exception e) {
            // Printing exception message instead of stack trace
            System.out.println(e.getMessage());
        }

        // Calling withdraw method
        CustomException.withdrowMoney(40);
    }
}