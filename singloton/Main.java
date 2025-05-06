package designPattern.singloton;

public class Main{
    public static void main(String[] args) {
        SingletonEnum singleton=SingletonEnum.INSTANCE;
        singleton.setValue(3);
        System.out.println(singleton.getValue());
        System.out.println(singleton.toString());
    }
}
