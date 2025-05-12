package designPattern.abstractFactory.banking;

import designPattern.abstractFactory.ProductOwner;

public class BankingPO implements ProductOwner {
    @Override
    public void manageProduct() {
        System.out.println("Banking PO");
    }
}
