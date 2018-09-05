package test;

public class PassByValueExample2 {

    public static void main(String[] args) {
        Emp a=new Emp(1);

        System.out.println("In main(), BEFORE passing a by value i.e. BEFORE calling method m()");
        System.out.println("a.id = "+a.id +" HashCode: "+a.hashCode());

        m(a); //Here a is reference to object Emp
        // a is passed by value (i.e. copy of a is created and passed),
        //a is not at all passed by reference,
        //it may look like that a is passed by reference but actually that doesn't happens at all
        //copy of a is created and that is passed to method m()

        System.out.println("\nIn main(), AFTER passing a by value i.e. AFTER calling method m()");
        System.out.println("a.id = "+a.id +" HashCode: "+a.hashCode());

    }

    static void m(Emp b){
        b.id = 2;
        System.out.println("\nIn method m(), after making some changes");
        System.out.println("b.id = " + b.id+ " HashCode: "+b.hashCode());
    }
}

class Emp{
    int id;

    public Emp(int id) {
        this.id = id;
    }
}
