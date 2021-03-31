package nonlib;

public class ScanService implements Service {
    @Override
    public void performTask() {
        System.out.println("Scanning in progress");
    }

    @Override
    public String getName() {
        return "scanService";
    }
}
