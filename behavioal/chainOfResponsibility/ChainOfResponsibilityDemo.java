package designPattern.behavioal.chainOfResponsibility;

class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        LogHandler consoleLogger = new ConsoleLogger(LogHandler.INFO);
        LogHandler fileLogger = new FileLogger(LogHandler.DEBUG);
        LogHandler emailLogger = new EmailLogger(LogHandler.ERROR);

        consoleLogger.setNext(fileLogger).setNext(emailLogger);

        System.out.println("Info level:");
        consoleLogger.log(LogHandler.INFO, "Information message");

        System.out.println("\nDebug level:");
        consoleLogger.log(LogHandler.DEBUG, "Debug message");

        System.out.println("\nError level:");
        consoleLogger.log(LogHandler.ERROR, "Error message");
    }
}