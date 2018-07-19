package java8features.methodreference;

@FunctionalInterface
interface MyInterfaceMReference{
    Hello display(String say);
}
class Hello{
    //Constructor
    public Hello(String say){
        System.out.print(say);
    }
}

public class Example4 {
    public static void main(String[] args) {

        //Constructor Reference
        MyInterfaceMReference ref = Hello::new;
        ref.display("Hello World");
    }
}
