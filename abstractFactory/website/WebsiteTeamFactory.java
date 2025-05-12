package designPattern.abstractFactory.website;

import designPattern.abstractFactory.Developer;
import designPattern.abstractFactory.ProductOwner;
import designPattern.abstractFactory.ProjectTeamFactory;
import designPattern.abstractFactory.Tester;

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

