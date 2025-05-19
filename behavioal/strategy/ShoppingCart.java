package designPattern.behavioal.strategy;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    private List<Integer> prices = new ArrayList<>();

    public void addItem(int price) {
        prices.add(price);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout() {
        int total = prices.stream().mapToInt(Integer::intValue).sum();
        paymentStrategy.pay(total);
        prices.clear();
    }
}
