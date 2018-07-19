package java8features.methodreference;

import java.util.function.BiFunction;

class MathOperation{

    public int add(int a,int b)
    {
        System.out.println("MathOperation->add()");
        return a+b;
    }

    public int sub(int a,int b)
    {
        System.out.println("MathOperation->sub()");

        return a-b;
    }
    public void disp(){
        System.out.println("MathOperation ---- Disp()");
    }
}

interface Test{

    public void display();
}

class TestImpl implements Test{

    @Override
    public void display() {
        System.out.println("TestImpl ---- Test Interface");
    }
}
public class MethodReferenceEx2 {

    public static void main(String[] args) {

        MathOperation op = new MathOperation();

        //Using Lambda Expression
        BiFunction<Integer,Integer,Integer> add = (a,b)->op.add(a,b);
        System.out.println("Added using Lambda Expression: "+add.apply(20,30));

        //using Method Reference
        BiFunction<Integer,Integer,Integer> add1 = op::add;
        System.out.println("Adding using Method References: "+add1.apply(20,30));

        Test t = op::disp;
        t.display();


    }



}
