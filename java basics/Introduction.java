// Introduction.java
// This file provides an overview of Java basics, including variables, data types, 
// wrapper classes, control structures, loops, and conditionals. 
// Uncomment the code blocks to see each concept in action.

// 'class' Keyword:
// In Java, a class is a blueprint for objects. It defines the structure and behavior
// that the objects created from this class will have. Here, 'Introduction' is a class.
public class Introduction {

    // 'public static void main' Method:
    // This is the main entry point for any Java application.
    // - 'public': The method is accessible from anywhere.
    // - 'static': The method belongs to the class, not an instance of the class.
    // - 'void': This method does not return any value.
    // - 'main': This is the name of the method that the JVM looks for as the starting point of a Java program.
    // - 'String[] args': This parameter allows the main method to accept an array of String arguments from the command line.
    public static void main(String[] args) {

        // 1. Variable Declaration and Data Types
        // Variables in Java are declared with a data type and initialized with a value.
        // Primitive Data Types:
        int number = 10; // Integer
        double price = 19.99; // Double
        char grade = 'A'; // Character
        boolean isJavaFun = true; // Boolean

        // Uncomment to print variable values
        System.out.println("Integer: " + number);
        System.out.println("Double: " + price);
        System.out.println("Character: " + grade);
        System.out.println("Boolean: " + isJavaFun);
    }
}
