package Loops;

public class quiz {
    public static void main(String s[]) {
        int b = 5;
        String list = "";
        while (b < 11) {
            b = b + 2;
            if (b % 2 == 1)
                list = b + " " + list;
        }
        System.out.print(list);

        String ss = "Java";

        System.out.println(ss.toUpperCase().length());
        System.out.println(ss.endsWith("a"));

        String sa = "Legion"+1+2+"QA"+""+3+4;

        System.out.println(sa);

        String a = "dog";
        a=null;
        System.out.println(a.toUpperCase());

    }
}
