package java8features.methodreference;

interface Predicate{
    boolean test(int n);
}

class EvenOddCheck{
    public static boolean isEven(int n)
    {
        return n%2==0;
    }
}
public class MethodReferenceEx1 {

    public static void main(String[] args) {

        System.out.println("====== Using Lambda Expression ===== ");
        Predicate predicate=n -> EvenOddCheck.isEven(n);
        System.out.println("Predicate Check: "+predicate.test(20));

        System.out.println("====== Using Method References ===== ");
        Predicate predicate1 = EvenOddCheck::isEven;
        System.out.println(predicate1.test(21));

    }
}
