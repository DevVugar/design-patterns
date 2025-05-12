package designPattern.abstractFactory.website;

import designPattern.abstractFactory.Developer;

public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Python code");
    }
}
