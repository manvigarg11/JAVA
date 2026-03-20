// Calculate the percentage of 4 subjects of 60 marks each and print the result
public class question2 {
    public static void main(String[] args) {
        double maths = 55; // Marks obtained in subject 1
        double chem = 48; // Marks obtained in subject 2
        double phy = 60; // Marks obtained in subject 3
        double eng = 52; // Marks obtained in subject 4
        double totalMarks = (maths + chem + phy + eng);// Total marks obtained
        double percentage = (totalMarks / 240) * 100; // Calculate percentage
        System.out.println(percentage); // Output will be: 68.75
    }
}