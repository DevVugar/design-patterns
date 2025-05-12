package designPattern.abstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();

    ProductOwner getProductOwner();
}
