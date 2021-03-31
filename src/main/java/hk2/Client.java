package hk2;

import org.glassfish.hk2.api.*;
import org.glassfish.hk2.utilities.BuilderHelper;

public class Client {
    public static void main(String[] args) {
        ServiceLocatorFactory serviceLocatorFactory = ServiceLocatorFactory.getInstance();
        ServiceLocator serviceLocator = serviceLocatorFactory.create("hello");

        DynamicConfigurationService dcs = serviceLocator.getService(DynamicConfigurationService.class);
        DynamicConfiguration dc = dcs.createDynamicConfiguration();
        dc.bind(createEmpl());
        dc.commit();

        Employee empl = serviceLocator.getService(Empl.class);
        empl.print();
    }

    public static Descriptor createEmpl() {
        return BuilderHelper.link("hk2.Empl")
                .to("hk2.Employee")
                .build();
    }
}
