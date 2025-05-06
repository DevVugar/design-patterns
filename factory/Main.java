package designPattern.factory;

public class Main {
    public static void main(String[] args) {
       PaymentFactory paymentFactory =createPaymentMethod(PayMethods.XPay);
       Payment paymentMethod=paymentFactory.createPayment();
       paymentMethod.pay();
    }

    public static PaymentFactory createPaymentMethod(PayMethods payMethods) {

           return switch (payMethods){
                case XPay -> new XPayFactory();
                case YPay -> new YPayFactory();
                case ZPay -> new ZPayFactory();
            };

    }
}
