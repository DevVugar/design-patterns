package designPattern.creational.abstractFactory.banking;

import designPattern.creational.abstractFactory.Developer;
import designPattern.creational.abstractFactory.ProductOwner;
import designPattern.creational.abstractFactory.ProjectTeamFactory;
import designPattern.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProductOwner getProductOwner() {
        return new BankingPO();
    }
}
