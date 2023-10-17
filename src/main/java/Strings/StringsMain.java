package Strings;

public class StringsMain {
    public static void main(String[] args) {
        StringsMain StringMain = new StringsMain();
        int res = StringMain.sumOfTwoNumbers(3,7);
        System.out.println(res);

        System.out.println(StringMain.getText());
        StringMain.stringExamples();

    }

    public int sumOfTwoNumbers(int num1, int num2){
        int result = num1+num2;
        return result;
    }
    public String getText(){
        return "some text";
    }

    public void stringExamples(){
        String txt1 = "cat";
        String txt2 = "catalog";
        System.out.println(txt2.contains(txt1));
        System.out.println(txt2.replace("log", txt1));

        System.out.println(txt1.charAt(0));
        System.out.println(txt1.charAt(2));
        System.out.println(txt1.charAt(txt1.length()-1));
    }
}
