package java8features.defaultmethods.test1;

import java8features.defaultmethods.test.TestInterface;

public class TestClass implements TestInterface {
    private int x;

    public int getX() {
        return x;
    }

    private int test1(){
        return x;
    }

    public int test2(){
        return test1();
    }
}
