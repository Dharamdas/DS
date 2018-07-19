package java8features.methodreference;

import java.util.function.BiFunction;

class Multiplication{

    public static int multiply(int a,int b){
        return a*b;
    }
}

public class Example2 {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> biFunction = Multiplication::multiply;
        int result = biFunction.apply(20,30);
        System.out.println("Multiplication Result: "+result);

    }
}
