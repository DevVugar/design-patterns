package designPattern.abstractFactory.banking;

import designPattern.abstractFactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java Code");
    }
}
