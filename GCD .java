import java.util.Scanner;

public class Main {
    
    // Function to compute GCD using Euclidean algorithm
    public static int findGCD(int a, int b) {
        // If b is 0, the GCD is a
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Find and display the GCD
        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        
        scanner.close();
    }
}