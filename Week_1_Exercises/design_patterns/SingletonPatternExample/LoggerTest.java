public class LoggerTest {
    public static void main(String[] args) {
        // Get two instances of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Test if both instances are the same
        if (logger1 == logger2) {
            System.out.println("LoggerTest passed: Both instances are the same.");
        } else {
            System.out.println("LoggerTest failed: Instances are different.");
        }

        // Test logging functionality
        logger1.log("This is a test log message.");
    }
}
