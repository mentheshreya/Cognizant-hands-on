import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    // Create Logger Object
    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);


    public static void main(String[] args) {

        // Error Level Logging
        logger.error("This is an error message");

        // Warning Level Logging
        logger.warn("This is a warning message");

        // Information Level Logging
        logger.info("Application started successfully");

        // Debug Level Logging
        logger.debug("Debugging application");

    }
}