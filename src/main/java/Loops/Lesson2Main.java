package Loops;

public class Lesson2Main {
    public static void main(String[] args) {
        Lesson2Main lesson2Main = new Lesson2Main();
        //lesson2.printUserInfo("John Doe", 1);

        boolean isScoreBonusAvailable = true;

        lesson2Main.checkUserScore("John Doe", 1, 40, isScoreBonusAvailable);
        lesson2Main.checkUserScore("Mark Smith", 2, 50, isScoreBonusAvailable);
        lesson2Main.checkUserScore("Anna Smith", 3, 60, isScoreBonusAvailable);
        lesson2Main.checkUserScore("Leon Doe", 3, -1, isScoreBonusAvailable);

    }

    public void printUserInfo(String userName, int userId, int i){
        System.out.println("The user name is " + userName);
        System.out.println("The user id is " + userId);

    }

    public void checkUserScore(String userName, int userId, int score, boolean bonus){
        System.out.println("The user name is " + userName);
        System.out.println("The user id is " + userId);



        if (userName.equals("John Doe")){
            score = score + 20;
        }

        if (bonus){
            score = score + 10;
        }

        if (score>100 || score<0){
            System.out.println("error");
        }
        else if (score >= 60){
            System.out.println("passed");
        }
        else {
            System.out.println("failed");
        }

        System.out.println("The user score is " + score);

    }
}
