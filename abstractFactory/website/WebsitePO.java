package designPattern.abstractFactory.website;

import designPattern.abstractFactory.ProductOwner;

public class WebsitePO implements ProductOwner {
    @Override
    public void manageProduct() {
        System.out.println("Website PO");
    }
}
