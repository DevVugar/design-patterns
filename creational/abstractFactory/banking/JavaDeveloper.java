package designPattern.creational.abstractFactory.banking;

import designPattern.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java Code");
    }
}
