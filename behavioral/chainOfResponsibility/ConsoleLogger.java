package designPattern.behavioral.chainOfResponsibility;

class ConsoleLogger extends LogHandler {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Console: " + message);
    }
}