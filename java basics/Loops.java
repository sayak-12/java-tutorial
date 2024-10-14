public class Loops {
    public static void main(String[] args) {
        // 4. Loops - For Loop
        // Java supports different types of loops: for, while, and do-while loops.
        // For Loop: Iterates a fixed number of times.
        // Uncomment the below code block to see the for loop in action
        for (int i = 1; i <= 5; i++) {
            System.out.println("For loop iteration: " + i);
        }
        // 5. While Loop
        // While Loop: Repeats as long as a condition is true.
        // Uncomment the below code block to see the while loop in action
        
        int count = 1;
        while (count <= 5) {
            System.out.println("While loop iteration: " + count);
            count++;
        }
        
        // 6. Do-While Loop
        // Do-While Loop: Executes at least once, then repeats while the condition is true.
        // Uncomment the below code block to see the do-while loop in action
        
        int counter = 1;
        do {
            System.out.println("Do-While loop iteration: " + counter);
            counter++;
        } while (counter <= 5);
        
    }
    
}
