package java8features.methodreference;


interface MyInterface {
    void display();
}

public class MyInterfaceTest {

    public static void main(String[] args) {

        MyInterfaceTest obj = new MyInterfaceTest();

        MyInterface ref = obj::mymethod;
        ref.display();

    }


    public void mymethod(){
        System.out.println("Testing....method from MyInterfaceTest");
    }
}
