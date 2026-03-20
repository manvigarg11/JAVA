public class variables 
{
    public static void main(String[] args) {
        int a, b, x;// make a container only for integers
        a = 10;
        System.out.println(a);
        b = 20; 
        System.out.println(b);
        x = 400;
        System.out.println(x);
        System.out.println(x+1); //add 1 to x and print the result but do not change the value of x
        x = x + 5;//add 5 to x and store the result in x
        System.out.println(x);
        int y = 100; // declare and initialize a variable in the same line
        System.out.println(y);
        y = 20;
        System.out.println(y);
        y = y + 10; // add 10 to y and store the result in y
        System.out.println(y);
        y = y - 5; // subtract 5 from y and store the result in y
        System.out.println(y);
        y = y * 2; // multiply y by 2 and store the result in y
        System.out.println(y);
        y = y / 4; // divide y by 4 and store the result in y
        x = 10;
        y = 20; // declare and initialize multiple variables in the same line
        System.out.println(y);
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println("The value of x is " +x);
        System.out.println(x+y+x^2);
        
    }
}