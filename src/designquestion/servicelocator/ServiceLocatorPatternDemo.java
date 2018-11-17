package designquestion.servicelocator;

public class ServiceLocatorPatternDemo {

    public static void main(String[] args) {
        Service service = ServcieLocator.getService("ServiceOne");
        service.execute();

        service = ServcieLocator.getService("ServiceTwo");
        service.execute();
    }
}
