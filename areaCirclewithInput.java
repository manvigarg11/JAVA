import java.util.Scanner;

public class areaCirclewithInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.println("Enter the radius of the circle: ");
        // int radus = 4; // Radius of the circle
        int radius;
        radius = sc.nextInt(); // Read the radius of the circle from user input
        double pi = 3.14;
        double area = pi * radius * radius; // Calculate the area of the circle
        System.out.println("The area of the circle is: " + area); // Print the area of the circle
        // Output will be: The area of the circle is: area
        // Note: The output will depend on the radius entered by the user.
        // For example, if the user enters 4, the output will be: The area of the circle is: 50.24
        // If the user enters 5, the output will be: The area of the circle is: 78.5
    }
}