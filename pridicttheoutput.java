public class pridicttheoutput {
    public static void main(String[] args) {
        int i = 2, j = 3, k, l;
        double a, b;
        k = i / j *j; // Integer division, result is 0, then multiplied by 3 gives 0
        l = j / i * i; // Integer division, result is 1, then multiplied by 2 gives 2
        a = i / j * j;  // Integer division, result is 0, then multiplied by 3 gives 0.0
        b = j / i * i; // Integer division, result is 1, then multiplied by 2 gives 2.0
        System.out.println(k+" "+l+" "+a+" "+b); // Output will be: 0 2 0.0 2.0
    }
}