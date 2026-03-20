import java.util.Scanner;

public class chardatatype{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user
        char ch = '{'; // Character data type to store a single character
        System.out.println(ch); // Print the character
        // Output will be: 
        int x = (int)ch; // Implicitly convert the character to its ASCII value
        System.out.println(x); // Print the ASCII value of the character
       // Output will be: 33

        //a b c d e f g h i j k l m n o p q r s t u v w x y z
        //A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        //0 1 2 3 4 5 6 7 8 9
        //ASCII values of characters: a = 97, b = 98, c = 99, ... z = 122
        //ASCII values of characters: A = 65, B = 66, C =
        //ASCII values are used to represent characters in computers. Each character has a unique ASCII value
        // ! @ # $ % ^ & * ( ) _ + - = { } [ ] | \ : ; " ' < > ? / ~ ` and so on have their own ASCII values as well.
        // For example, the ASCII value of '!' is 33, '@' is 64, '#' is 35, and so on.
    }
}