package designPattern.behavioal.strategy;

class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(100);
        cart.addItem(50);

        cart.setPaymentStrategy(new CreditCardPayment("1234567890123456"));
        cart.checkout();

        cart.addItem(200);
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout();
    }
}