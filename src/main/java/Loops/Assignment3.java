package Loops;

public class Assignment3 {
    public static void main(String[] args) {
        Assignment3 Assignment3 = new Assignment3();
        Assignment3.printNumbers();
        Assignment3.calculateNumbers(2, 8);
        Assignment3.drawPyramid(10);
    }

    public void printNumbers (){
        for (int i=1; i<=100; i++){
            if (i%2==0){
                if (i%3==0){
                    System.out.println(i + " is divisible by two and three");
                    continue;
                }
                System.out.println(i + " is even");
            }
            else if (i%3==0){
                System.out.println(i + " is divisible by three");
            }
            else {
                System.out.println(i + " is odd");
            }
        }
    }


    public void calculateNumbers (int a, int b){
        int c = a;
        while (a<b){
            a = a+1;
            c = c + a;
        }
        System.out.println("The summary of all numbers between a and b is " + c);
    }

    public void drawPyramid (int rows){

        for (int i=rows; i>=0; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
