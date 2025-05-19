package designPattern.creational.prototype;

public class Main {
    public static void main(String[] args) {
        var project = new Project(1, "name", "code");
        var projectFactory = new ProjectFactory(project);
        var cloneProject = projectFactory.cloneProject();
        System.out.println(cloneProject);
        System.out.println(project==cloneProject);

    }
}
