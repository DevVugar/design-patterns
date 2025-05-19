package designPattern.creational.abstractFactory.website;

import designPattern.creational.abstractFactory.Developer;

public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Python code");
    }
}
