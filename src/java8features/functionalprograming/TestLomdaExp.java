package java8features.functionalprograming;

public class TestLomdaExp {
    public static void main(String[] args) {
        double val=4.7;
        TestLamda testLamda = (v)-> {
            System.out.println(v*v*4.7);
        };
        testLamda.area(val);
    }
}

@FunctionalInterface
interface TestLamda{
    public void area(double val);
}
