package designPattern.creational.abstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();

    ProductOwner getProductOwner();
}
