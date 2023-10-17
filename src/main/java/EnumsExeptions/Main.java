package EnumsExeptions;

import FileManager.Game;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        double result = Calculator.calculate(8,4, null);
        logger.info("result: " + result);

        result = Calculator.calculate(66,4, Calculator.Type.SUBTRACTION);
        logger.info("result: " + result);

        result = Calculator.calculate(3,55, Calculator.Type.SUMMARY);
        logger.info("result: " + result);

        /*SELF TRAINING*/
        String[] typedWords = { "catt", "Dog", "bird", "beer"};
        String[] correctedWords = {"cat", "dog", "bird", "bear"};
        SelfTraining7 selfTraining7 = new SelfTraining7();
        System.out.println(selfTraining7.correctStream(typedWords, correctedWords));

        System.out.println(selfTraining7.nameShuffle(null));

        System.out.println(selfTraining7.doubleLetters("GoOgle"));

        System.out.println(selfTraining7.calculateScores("AABBACCC"));
    }
}
