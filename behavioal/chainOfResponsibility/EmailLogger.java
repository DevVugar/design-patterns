package designPattern.behavioal.chainOfResponsibility;

class EmailLogger extends LogHandler {
    public EmailLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Email: " + message);
    }
}
