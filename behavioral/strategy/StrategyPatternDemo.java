package designPattern.behavioral.strategy;

class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(100);
        cart.addItem(50);

        cart.setPaymentStrategy(new CreditCardPayment("1234567890123456"));
        cart.checkout();

        System.out.println("----");

        cart.addItem(200);
        cart.setPaymentStrategy(new PayPalPayment("email@example.com"));
        cart.checkout();
    }
}