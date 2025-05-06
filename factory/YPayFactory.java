package designPattern.factory;

public class YPayFactory implements PaymentFactory{

    @Override
    public Payment createPayment() {
        return new YPay();
    }
}
