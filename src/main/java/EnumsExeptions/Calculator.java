package EnumsExeptions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
//    public static final int MULTIPLICATION=1;
//    public static final int SUMMARY=2;
//    public static final int DIVISION=3;
//    public static final int SUBTRACTION=4;

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public enum Type {MULTIPLICATION,
        SUMMARY,
        DIVISION,
        SUBTRACTION
    }

    public static double calculate(double a, double  b, Type type){
        logger.info("Running method calculate");
        double result = 0;
        try{
            switch (type){
                case MULTIPLICATION:
                return a*b;
                case SUMMARY:
                return a+b;
                case DIVISION:
                return a/b;
                case SUBTRACTION:
                return a-b;
                default: result = -1;
            }
        }
        catch (Exception err){
            logger.error("Something went wrong", err);
            throw err; /*in case we want the program to stop*/
        }
        return result;
    }
}
