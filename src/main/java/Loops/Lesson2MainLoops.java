package Loops;

public class Lesson2MainLoops {
    public static void main(String[] args){
        Lesson2MainLoops Lesson2MainLoops = new Lesson2MainLoops();
        //Lesson2MainLoops.countNumbers(4);
        //Lesson2MainLoops.countNumbers();
        Lesson2MainLoops.numbersTemplate(10);


    }

    public void countNumbers (int i){
        while (i<=10){
            System.out.println(i);
            i = i + 1;
        }
    }

    public void countNumbers(){
        for (int i=1; i < 100; i++){
            System.out.println(i);
        }
    }

    public void numbersTemplate(int rows){
        for (int i=1; i < rows; i++) {
//            if (i % 2 == 0){
//                continue;
//            }
//           if (i==7){
//               break;
//           }
            for (int j=1; j<=i; j++) {
            System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
