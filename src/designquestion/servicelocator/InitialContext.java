package designquestion.servicelocator;

// Checking the context
// for ServiceOne and ServiceTwo
public class InitialContext {

    public Object lookup(String name)
    {
        if(name.equalsIgnoreCase("ServiceOne")){
            return new ServiceOne();
        }else if(name.equalsIgnoreCase("ServiceTwo"))
        {
            return new ServiceTwo();
        }
        return null;
    }
}
