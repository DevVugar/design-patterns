package designPattern.creational.abstractFactory.website;

import designPattern.creational.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual test");
    }
}
