
public class Ifelse {

    public static void main(String[] args) {
        int number = 10; // Integer

        // 3. Control Structures - If-Else Ladder
        // Java supports control structures like if, if-else, and if-else-if ladders.
        // Uncomment to see if-else ladder in action
        if (number > 20) {
            System.out.println("Number is greater than 20.");
        } else if (number > 10) {
            System.out.println("Number is greater than 10 but less than or equal to 20.");
        } else {
            System.out.println("Number is 10 or less.");
        }
        // 7. Switch Case
        // Switch Case: Useful when there are multiple conditions for a single variable.
        // Uncomment the below code block to see the switch case in action. 
        // note: this is the rule switch representation of switch case.
        
        char gradeLetter = 'B';
        switch (gradeLetter) {
            case 'A' -> System.out.println("Excellent!");
            case 'B' -> System.out.println("Well done.");
            case 'C' -> System.out.println("Good.");
            case 'D' -> System.out.println("Pass.");
            case 'F' -> System.out.println("Fail.");
            default -> System.out.println("Invalid grade.");
        }
        
    }

}
