package nonlib;

public class ServiceLocator {
    private static Registry registry;

    static  {
        registry = new Registry();
    }

    public static Service getService(String serviceName) {
        Service service = registry.getService(serviceName);

        if (service != null) return service;

        ContextInitilizer ci = new ContextInitilizer();
        Service newService = (Service) ci.lookUp(serviceName);
        registry.addService(newService);
        return newService;
    }
}
