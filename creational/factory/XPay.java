package designPattern.creational.factory;

public class XPay implements Payment{
    @Override
    public void pay() {
        System.out.println("XPay");
    }
}
