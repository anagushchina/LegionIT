package Lesson4;

public class StringConversions {
    public static void main(String[] args) {

        String txt = "5";
        int intxtx = Integer.parseInt(txt);
        int result = intxtx + 2;
        System.out.println(result);

        int i = 555;
        String result2 = String.valueOf(i);
        System.out.println(result2);
        System.out.println(result2.length());
    }
}
