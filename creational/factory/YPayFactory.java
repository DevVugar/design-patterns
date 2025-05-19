package designPattern.creational.factory;

public class YPayFactory implements PaymentFactory{

    @Override
    public Payment createPayment() {
        return new YPay();
    }
}
