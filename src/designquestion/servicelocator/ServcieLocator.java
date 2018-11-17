package designquestion.servicelocator;

public class ServcieLocator {
    private static Cache cache;
    static {
        cache=new Cache();
    }

    public static Service getService(String name){

        Service service = cache.getService(name);

        if(service!=null)
        return service;

        InitialContext initialContext = new InitialContext();
        Service service1= (Service) initialContext.lookup(name);
        cache.AddService(service1);
        return service1;
    }
}
