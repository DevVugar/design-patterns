package designPattern.factory;

public class ZPay implements Payment{
    @Override
    public void pay() {
        System.out.println("ZPay");
    }
}
