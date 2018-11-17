package designquestion.servicelocator;

import java.io.Serializable;

// Service one implementing Locator
public class ServiceOne implements Service {
    @Override
    public String getName() {
        return "ServiceOne";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service One");
    }
}
