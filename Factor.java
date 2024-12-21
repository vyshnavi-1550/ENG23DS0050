import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Factor pairs of " + number + " are: ");
        
        // Loop to find factor pairs
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) { // Check if i is a factor
                // If i is a factor, the pair is (i, number/i)
                int pair = number / i;
                System.out.println(i + " and " + pair);
            }
        }

        scanner.close();
    }
}