package designPattern.behavioral.chainOfResponsibility;

class FileLogger extends LogHandler {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File: " + message);
    }
}
