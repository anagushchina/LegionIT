package Week;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WeekMain {

    private static final Logger logger = LogManager.getLogger(WeekMain.class);

    public static void main(String[] args) {
        Week week = new Week();
        String result = week.getDay(5);
        logger.info("The result is: " + result);
    }
}
