package nonlib;

public class PrintService implements Service {
    @Override
    public void performTask() {
        System.out.println("Printing in progress");
    }

    @Override
    public String getName() {
        return "printService";
    }
}
