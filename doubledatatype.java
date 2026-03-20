public class doubledatatype {
    public static void main(String[] args) {
        double a = 5;
        double b = 2;
        double sum = a + b;
        System.out.println(sum);
        double divide = a / b;// This will perform double division
        System.out.println(divide);
        double divide2 = 5 / 2; // This will perform integer division and then convert the result to double
        System.out.println(divide2);
        double divide3 = 5.0 / 2; // This will perform double division
        System.out.println(divide3);
        double divide4 = 5 / 2.0; // This will perform double division
        System.out.println(divide4);
    }
}