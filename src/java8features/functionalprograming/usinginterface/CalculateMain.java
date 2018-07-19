package java8features.functionalprograming.usinginterface;

public class CalculateMain {

    public static void main(String[] args) {

        Shape shape = new Circule(4.4);
        System.out.println("Circular Shape: "+shape.area());
        shape = new Square(5.5);
        System.out.println("Square Shape: "+shape.area());



    }
}
