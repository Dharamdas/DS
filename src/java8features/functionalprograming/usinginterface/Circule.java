package java8features.functionalprograming.usinginterface;

public class Circule  implements Shape{
    private double side;

    public Circule(double side)
    {
        this.side=side;
    }

    @Override
    public double area() {
        return Math.PI*side*side;
    }
}
