package designPattern.creational.abstractFactory.website;

import designPattern.creational.abstractFactory.Developer;
import designPattern.creational.abstractFactory.ProductOwner;
import designPattern.creational.abstractFactory.ProjectTeamFactory;
import designPattern.creational.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProductOwner getProductOwner() {
        return new WebsitePO();
    }
}

