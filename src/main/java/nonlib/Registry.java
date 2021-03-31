package nonlib;

import java.util.ArrayList;
import java.util.List;

public class Registry {
    List<Service> services;

    public Registry() {
        services = new ArrayList<>();
    }

    public void addService(Service service) {
        boolean isExist = false;
        for (Service s: services) {
            if (s.getName().equalsIgnoreCase(service.getName())) isExist = true;
        }

        if (!isExist) services.add(service);
    }

    public Service getService(String serviceName) {
        Service service;
        for(Service s: services) {
            if (s.getName().equalsIgnoreCase(serviceName)) {
                return s;
            }
        }
        return null;
    }
}
