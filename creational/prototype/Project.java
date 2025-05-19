package designPattern.creational.prototype;

public class Project implements VersionControlCommands {
    private final long age;
    private final String name;
    private final String sourceCode;

    public Project(long age, String name, String sourceCode) {
        this.age = age;
        this.name = name;
        this.sourceCode = sourceCode;
    }

    @Override
    public String toString() {
        return "Project{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        return new Project(age, name, sourceCode);
    }
}
