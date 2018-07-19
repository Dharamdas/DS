package java8features.functionalprograming;

public class CalculateArea {

    public static void main(String[] args) {
        double value = 4.7;
        CalculateArea obj = new CalculateArea();

        System.out.println(obj.areaOfCircule(value));
        System.out.println(obj.areaOfCircule(value));
    }

    public double areaOfSqure(double a){
        return a*a;
    }

    public double areaOfCircule(double a){
        return Math.PI*a*a;
    }

}
