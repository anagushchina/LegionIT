package Strings;

public class StringFormat {
    public static void main(String[] args) {


        String name = "John";
        String gender = "male";
        int age = 30;
        double salary = 5000.5;

        System.out.println(String.format("Name is %s, gender is %s, age is %d, salary is %f", name, gender, age, salary));

    }
}
