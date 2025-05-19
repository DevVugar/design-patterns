package designPattern.creational.abstractFactory.banking;

import designPattern.creational.abstractFactory.ProductOwner;

public class BankingPO implements ProductOwner {
    @Override
    public void manageProduct() {
        System.out.println("Banking PO");
    }
}
