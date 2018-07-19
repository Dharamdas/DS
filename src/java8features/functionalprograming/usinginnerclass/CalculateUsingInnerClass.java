package java8features.functionalprograming.usinginnerclass;

import java8features.functionalprograming.usinginterface.Shape;

public class CalculateUsingInnerClass {

    public static void main(String[] args) {

        double a = 4.4;
        Shape circularshape = new Shape() {
            @Override
            public double area() {
                return (Math.PI*a * a);
            }
        };
        System.out.println("Circular Area: "+circularshape.area());


        Shape squreShape = new Shape() {
            @Override
            public double area() {
                return a*a;
            }
        };
        System.out.println("Square Area: "+squreShape.area());
    }


}
