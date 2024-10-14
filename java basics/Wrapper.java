public class Wrapper {
    public static void main(String[] args) {
        // 2. Wrapper Classes
        // Wrapper classes provide a way to use primitive data types as objects.
        int number = 10; // Integer
        double price = 19.99; // Double
        char grade = 'A'; // Character

        Integer wrappedInt = Integer.valueOf(number); // Wrapper class for int
        Double wrappedDouble = Double.valueOf(price); // Wrapper class for double
        Character wrappedChar = Character.valueOf(grade); // Wrapper class for char

        // Uncomment to print wrapped values
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Wrapped Character: " + wrappedChar);
    }
    
}
