package designPattern.creational.abstractFactory.website;

import designPattern.creational.abstractFactory.ProductOwner;

public class WebsitePO implements ProductOwner {
    @Override
    public void manageProduct() {
        System.out.println("Website PO");
    }
}
