package designPattern.abstractFactory.banking;

import designPattern.abstractFactory.Developer;
import designPattern.abstractFactory.ProductOwner;
import designPattern.abstractFactory.ProjectTeamFactory;
import designPattern.abstractFactory.Tester;

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
