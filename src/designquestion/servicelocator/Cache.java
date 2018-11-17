package designquestion.servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    private List<Service> services;
    public Cache(){
        this.services=new ArrayList<>();
    }

    public Service getService(String serviceName){
        for(Service service:services)
        {
            if(service.getName().equalsIgnoreCase(serviceName))
            {
                System.out.println("Returning Cached Service: "+service);
                return service;
            }

        }
        return null;
    }

    public void AddService(Service newService){
        boolean exist=false;
        for(Service service:services)
        {
            if(newService.getName().equalsIgnoreCase(service.getName()))
            {
                exist=true;
            }
        }
        if(!exist)
            services.add(newService);


    }
}
