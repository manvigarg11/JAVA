public class operators{
    public static void main(String[] args) {
        int i = 2 * 3 / 4 + 7 / 4 + 8 - 2 + 5 / 8; // Evaluating the expression step by step:
        // 2 * 3 = 6
        // 6 / 4 = 1 (integer division)
        // 7 / 4 = 1 (integer division)
        // 8 - 2 = 6
        // 5 / 8 = 0 (integer division)
        // Now summing all the results: 1 + 1 + 6 + 0 = 8
        
        System.out.println(i); // Output will be: 10
    }
}