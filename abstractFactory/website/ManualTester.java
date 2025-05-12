package designPattern.abstractFactory.website;

import designPattern.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual test");
    }
}
