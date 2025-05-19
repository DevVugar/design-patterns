package designPattern.creational.singloton;

public enum SingletonEnum {
    INSTANCE;
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SingletonEnum{" +
                "value=" + value +
                '}';
    }
}