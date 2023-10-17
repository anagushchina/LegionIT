package Strings;

public class Assignment4 {



    public static void main(String[] args) {

//        Write a program (method) that will receive two strings and do the following:
//        1.) print if one string is part of another:
//        2.) If Strings are equal, the expected print is:
//        "The Strings are the same"
//        3.) If one of the strings is a null -  print:
//        "Cannot compare Strings"
        Assignment4 Assignment4 = new Assignment4();
        String txt1 = "Cat log";
        String txt2 = "t l";
        Assignment4.compareStrings(txt1, txt2);

//        Given a string, write a program to check if it is palindrome or not (return boolean).
        boolean result = Assignment4.isPalindrome("racecar");
        if(result){
            System.out.println("This string is a palindrome");
        }
        else{
            System.out.println("This string is not a palindrome");
        }

    }

    public void compareStrings(String txt1, String txt2){
//        if(txt1 == null || txt2 == null) {
//            System.out.println("Cannot compare null string");
//        }
        if(txt1.isBlank() || txt2.isBlank()){
            System.out.println("Cannot compare empty string");
        }
        else if(txt1.equals(txt2)){
            System.out.println("The strings are the same");
        }
        else {
            txt1 = txt1.toLowerCase();
            txt2 = txt2.toLowerCase();
            if (txt2.contains(txt1)) {
                System.out.println(txt1 + " is the part of " + txt2);
            }
            else if (txt1.contains(txt2)) {
                System.out.println(txt2 + " is the part of " + txt1);
            }
            else {
                System.out.println("none of the strings contain the other");
            }
        }
    }

    public boolean isPalindrome(String initialText) {

        String reversedText = "";

        if(initialText == null) {
            System.out.println("InitialText is null");
        }
        else if(initialText.isBlank()) {
            System.out.println("InitialText is empty");
        }
        else {
            System.out.println(initialText);
            int initialTextLength = initialText.length();
            for (int i = initialTextLength; i > 0; i--) {
                reversedText = reversedText + initialText.charAt(i - 1);
            }
            System.out.println(reversedText);
        }

        if (reversedText.equals(initialText)) {
            return true;
        }
        else {
            return false;
        }
    }
}
