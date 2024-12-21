import java.util.Scanner;

public class Factorial {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int num = scanner.nextInt();
       
       // Using for loop
       int factorial = 1;
       for (int i = 1; i <= num; i++) {
           factorial *= i;
       }
       System.out.println("Factorial (for loop): " + factorial);
       
       // Using while loop
       factorial = 1;
       int i = 1;
       while (i <= num) {
           factorial *= i;
           i++;
       }
       System.out.println("Factorial (while loop): " + factorial);
       
       // Using do-while loop
       factorial = 1;
       i = 1;
       do {
           factorial *= i;
           i++;
       } while (i <= num);
       System.out.println("Factorial (do-while loop): " + factorial);
   }
}