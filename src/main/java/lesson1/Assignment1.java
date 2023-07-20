package lesson1;

public class Assignment1 {
    public static void main(String[] args) {

        //1. Write a Java program to print 'Hello' on the screen and then print your name on a separate line.
        //Expected Output :
        //Hello
        //Vasiliy Pupkin

        String myName = "Anastasiia Gushchina";
        System.out.println("Hello");
        System.out.println(myName);

        //2. Write a Java program to print the result of the following operations.
        //a. -5 + 8 * 6
        //b. 20 + -3*5 / 8

        int x = -5;
        int y = 8;
        int z = 6;
        int m = 20;
        int n = -3;
        int o = 5;

        int a = x + y * z;
        double b = m + (double) n * o / y;
        System.out.println("a. " + a);
        System.out.println("b. " + b);

        //3. Write a java program with 5 decimal variables. Multiply all 5 of them
        //and print results in the following format:
        //number a * number b *.... equals <result>

        double e = 5.5;
        double f = 1.234;
        double g = 30.36;
        double h = 10.1821;
        double i = 7.3;

        double result = e * f * g * h * i;
        System.out.println("number e * number f * number g * number h * number i equals " + result);

    }
}
