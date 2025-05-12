package designPattern.abstractFactory;

import designPattern.abstractFactory.banking.BankingTeamFactory;

public class BankingApp {
    public static void main(String[] args) {
        var projectTeamFactory = new BankingTeamFactory();
        var developer = projectTeamFactory.getDeveloper();
        var tester = projectTeamFactory.getTester();
        var productOwner = projectTeamFactory.getProductOwner();


        developer.writeCode();
        tester.testCode();
        productOwner.manageProduct();
    }
}
