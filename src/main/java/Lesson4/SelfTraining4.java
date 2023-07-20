package Lesson4;

public class SelfTraining4 {
    public static void main(String[] args) {
//        Given a string, take the last char and return a new string with the last char added at the beginning
//        and the end, so "dog" will become "gdogg". The original string should be length 1 or more.
        SelfTraining4 SelfTraining4 = new SelfTraining4();
        System.out.println(SelfTraining4.addChars("qwerty"));

//        Return true if the given string begins with "max", except the 'm' can be anything,
//        so "pax", "9ax" .. all count.
        System.out.println("result of maxStart is " + SelfTraining4.maxStart(null));

//        Given string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
//        If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged
        System.out.println(SelfTraining4.fizzString("nfeebm"));

//        Return true if the given string contains a "bib" string, but where the middle 'i' char can be any char.
        System.out.println(SelfTraining4.bibThere("xcbub"));
        System.out.println("result if bibthere1 is " + SelfTraining4.bibThere1("aabuub"));
        System.out.println("result if bibthere2 is " + SelfTraining4.bibThere2("vdb"));

//        Given a string and a non-negative int n, return a larger string that is n copies of the original string.
        System.out.println(SelfTraining4.stringTimes("Hi", 10));

//        Create a function that takes in a word and determines whether or not it is plural.
//        A plural word is one that ends in "s".
        System.out.println(SelfTraining4.isPlural("Cats"));

    }

    public String addChars(String str) {
        String strNew = "";
        if(str==null || str.length()<1){
            System.out.println("Error: The original string should be length 1 or more.");
        }
        else {
            strNew = str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
        }
        return strNew;
    }

    public boolean maxStart(String str) {
        boolean result = false;
        if(str==null || str.isBlank()){
            System.out.println("Error: The string cannot be null, empty or blank");
        }
        else if(str.substring(1,3).equalsIgnoreCase("ax")){
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }

    public String fizzString(String str){
        String strNew = "";

        if(str.startsWith("f") && str.endsWith("b")) {
            strNew="FizzBuzz";
        } else if(str.startsWith("f")){
            strNew="Fizz";
        } else if (str.endsWith("b")) {
            strNew="Buzz";
        } else {
            strNew=str;
        }
        return strNew;

    }

    public boolean bibThere(String str){
        boolean resultBigThere = false;
        if(str.matches(".*b.b.*")){
            resultBigThere = true;
        }
        return resultBigThere;

    }
    public boolean bibThere1(String str){
        boolean resultBigThere1 = false;
        if(str.contains("b")){
            String letter1 = "b";
            int indexOfLetter1 = str.indexOf(letter1);
            if(indexOfLetter1+2<=str.length()-1) {
                String letter2 = String.valueOf(str.charAt(indexOfLetter1+2));
                if(letter1.equals("b") && letter2.equals("b")){
                    resultBigThere1=true;
                }
            }
        }
        return resultBigThere1;
    }

    public boolean bibThere2(String str) {
        boolean resultBigThere2 = false;

        for(int i=0; i<str.length()-1; i++){

            if (str.charAt(i)=='b' && str.charAt(i+2)=='b'){
                resultBigThere2=true;
            }

        }
        return resultBigThere2;
    }



        public String stringTimes(String str, int n){
        String newStr = "";
        for(int i=1; i<=n; i++){
            newStr = newStr+str;
        }
        return newStr;
    }

    public boolean isPlural(String str){
        boolean resultIsPlural = false;
        if(str.endsWith("s")){
            resultIsPlural = true;
        } else {
            resultIsPlural = false;
        }
        return resultIsPlural;
    }


}
