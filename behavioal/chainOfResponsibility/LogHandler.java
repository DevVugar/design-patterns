package designPattern.behavioal.chainOfResponsibility;

abstract class LogHandler {
    protected static final int INFO = 1;
    protected static final int DEBUG = 2;
    protected static final int ERROR = 3;

    protected int level;
    protected LogHandler nextHandler;

    // Set the next handler in the chain
    public LogHandler setNext(LogHandler handler) {
        this.nextHandler = handler;
        return handler;
    }

    // Process the request
    public void log(int level, String message) {
        if (this.level <= level) {
            write(message);
        }

        if (nextHandler != null) {
            nextHandler.log(level, message);
        }
    }

    // Handler-specific implementation
    protected abstract void write(String message);
}