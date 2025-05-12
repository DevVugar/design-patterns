package designPattern.abstractFactory;

import designPattern.abstractFactory.website.WebsiteTeamFactory;

public class WebsiteApp {
    public static void main(String[] args) {
        var projectTeamFactory = new WebsiteTeamFactory();
        var developer = projectTeamFactory.getDeveloper();
        var tester = projectTeamFactory.getTester();
        var productOwner = projectTeamFactory.getProductOwner();


        developer.writeCode();
        tester.testCode();
        productOwner.manageProduct();
    }
}
