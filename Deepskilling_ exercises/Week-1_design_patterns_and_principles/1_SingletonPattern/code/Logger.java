package singleton;

public class Logger {
    private static Logger instance;

    // Private constructor so others can't create objects directly
    private Logger() {
        System.out.println("Logger Initialized.");
    }

    // Static method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();  // only created once
        }
        return instance;
    }

    // Example method to log messages
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
