package designPattern.factory;

public class XPayFactory implements PaymentFactory{
    @Override
    public Payment createPayment() {
        return new XPay();
    }
}
