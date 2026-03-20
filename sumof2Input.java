import java.util.Scanner;

public class sumof2Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt(); // Read the first number from user input
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt(); // Read the second number from user input
        int sum = num1 + num2; // Calculate the sum of the two numbers
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum); // Print the sum of the two numbers
        // Output will be: The sum of num1 and num2 is: sum
        // Note: The output will depend on the numbers entered by the user.
        // For example, if the user enters 5 and 10, the output will be: The sum of 5 and 10 is: 15
        
    }
}