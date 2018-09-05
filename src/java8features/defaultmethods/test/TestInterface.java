package java8features.defaultmethods.test;

public interface TestInterface {
    default void test(){

        System.out.println("TestInterface -- test() ");
    }
}
