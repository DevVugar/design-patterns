package designPattern.factory;

public class ZPayFactory implements PaymentFactory{
    @Override
    public Payment createPayment() {
        return new ZPay();
    }
}
