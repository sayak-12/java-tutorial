// Exceptions.java
// This file provides an overview of Java exceptions, including different types of exceptions, 
// how to handle exceptions with try-catch, using multiple catch blocks, the finally block, 
// and creating custom exceptions.

public class Exceptions {

    public static void main(String[] args) {

        // 1. Types of Exceptions
        // Exceptions in Java are categorized into Checked Exceptions and Unchecked Exceptions.
        // - Checked Exceptions (e.g., IOException): Must be handled during compile-time.
        // - Unchecked Exceptions (e.g., ArithmeticException, NullPointerException): Occur at runtime.

        // 2. Try-Catch Block
        // The try-catch block is used to handle exceptions.
        // Uncomment the code below to see how try-catch works.
        
        /*
        try {
            int division = 10 / 0; // This will throw an ArithmeticException
            System.out.println("Result: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
        */
        
        // 3. Multiple Catch Blocks
        // Multiple catch blocks can be used to handle different types of exceptions separately.
        // Uncomment the code below to see how multiple catch blocks work.
        
        /*
        try {
            String text = null;
            System.out.println(text.length()); // This will throw a NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException.");
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
        */
        
        // 4. Finally Block
        // The finally block is executed regardless of whether an exception was caught or not.
        // Uncomment the code below to see how finally works.
        
        /*
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
        */
        
        // 5. Throwing an Exception
        // You can throw an exception explicitly using the 'throw' keyword.
        // Uncomment the code below to see how to throw an exception.
        
        /*
        try {
            throw new IllegalArgumentException("This is an IllegalArgumentException.");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        }
        */
        
        // 6. Custom Exceptions
        // You can define your own exceptions by extending the Exception class or RuntimeException class.
        // Uncomment the code below to see how custom exceptions work.
        
        /*
        try {
            checkAge(15); // This will throw the custom exception
        } catch (AgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
        */
    }

    // Method that throws a custom exception if age is below 18
    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above to proceed.");
        } else {
            System.out.println("Age verified: Access granted.");
        }
    }
}

// Custom Exception Class
// This class extends Exception, making it a Checked Exception. 
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}
