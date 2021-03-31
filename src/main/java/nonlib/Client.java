package nonlib;

public class Client {
    public static void main(String[] args) {
        Service pService = ServiceLocator.getService("printService");
        System.out.println(pService.getName());
        pService.performTask();

        Service sService = ServiceLocator.getService("scanService");
        System.out.println(sService.getName());
        sService.performTask();
    }
}
