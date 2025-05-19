package designPattern.creational.factory;

public class YPay implements Payment{
    @Override
    public void pay() {
        System.out.println("YPay");
    }
}
