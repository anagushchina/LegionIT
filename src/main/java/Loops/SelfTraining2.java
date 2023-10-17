package Loops;

public class SelfTraining2 {
    public static void main(String[] args) {

//        Given an int n, print true if it is within 10 of 100. Note:
        SelfTraining2 SelfTraining2 = new SelfTraining2();
        SelfTraining2.nearHundred(100);

//        Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.
//        Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
        SelfTraining2.lastDigit(0,10);

//        Given three int values, a b c, print the largest.
        SelfTraining2.maxInt(3, 1, 3);

//        Everyone loves the number 7. Given two int values, a and b, print true if either one is 7.
//        Or if their sum is 7.
        SelfTraining2.loveSeven(1,8);

//        Your cell phone rings. Print true if you should answer it. Normally you answer, except in the morning
//        you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
        SelfTraining2.answerCell(false, true, true);

//        Create a function that determines whether or not it's possible to split a pie fairly
//        given these three parameters: Total number of slices, Number of recipients, How many slices each person gets.
        SelfTraining2.equalSlices(10, 5, 2);
    }

    public void nearHundred(int n) {
        if(n>=90 && n<=100){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

    public void lastDigit(int a, int b) {
        int aMod=0;
        int bMod=0;
        if(a>=10){
            aMod=a%10;
        }
        System.out.println("a mod = " + aMod);
        if(b>=10){
            bMod=b%10;
        }
        System.out.println("b mod = " + bMod);

        if(aMod==bMod){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

    public void maxInt(int a, int b, int c) {
        int maxNumber1 = 0;
        int maxNumber2 = 0;
        if(a>b){
            maxNumber1=a;
        }
        else maxNumber1=b;
        if(a>c){
            maxNumber2=a;
        }
        else {
            maxNumber2=c;
        }
        if(maxNumber1>maxNumber2){
            System.out.println("the largest value is " + maxNumber1);
        }
        else{
            System.out.println("the largest value is " + maxNumber2);
        }
    }

    public void loveSeven(int n, int m){
        if(n==7 || m==7 || n+m==7){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

//    public void answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
//        if(isAsleep){
//            if(isMorning) {
//                if (isMom) {
//                    System.out.println("should I answer? " + true);
//                }
//            }
//            else {
//                System.out.println("should I answer? " + false);
//            }
//        }
//        else if(isMorning){
//                System.out.println("should I answer? " + false);
//            }
//        else {
//            System.out.println("should I answer? " + true);
//        }
//    }

    public void answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep)
            System.out.println("should I answer? " + false);
        else
        if(isMorning){
            if(isMom)
                System.out.println("should I answer? " + true);
            else
                System.out.println("should I answer? " + false);
        }
        else
            System.out.println("should I answer? " + true);
    }

    public void equalSlices(int totalSlices, int ppl, int slicesPerPerson){
        if(ppl*slicesPerPerson<=totalSlices){
            System.out.println("is it possible to split the pie fairly? " + true);
        }
        else {
            System.out.println("is it possible to split the pie fairly? " + false);
        }
    }
}
