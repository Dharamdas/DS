package java8features.functionalprograming;

public class TestScopeInterfaceImpl {


    public static void main(String[] args) {
            int x=20;


            //Test Scope as Inner Class
        TestScopeInterface testScopeInnerClass = new TestScopeInterface() {
            @Override
            public void Foo() {
                int x=10;
                System.out.println("Inner Class Test Scope "+(x+5));
            }
        };
        testScopeInnerClass.Foo();


        TestScopeInterface scopeInterfaceLambdaExp = ()->{
            //int x=10;
            System.out.println("Lambda Expression Test Scope: "+(x));
        };
        scopeInterfaceLambdaExp.Foo();

    }

}
