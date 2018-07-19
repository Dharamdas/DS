package java8features.functionalprograming.ussingfuntionalinterface;

public class CalculateAreaUsingFunctionalInterface {

    public static void main(String[] args) {
        double value=4.4;

        ShapeF circularArea=val-> System.out.println(Math.PI*val*val);
        circularArea.area(value);
        ShapeF squareArea = v -> System.out.println(v*v);
        squareArea.area(value);


    }
}
