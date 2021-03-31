package nonlib;

public class ContextInitilizer {
    public Object lookUp(String name) {
        if (name.equals("printService")) {
            return new PrintService();
        } else if (name.equals("scanService")) {
            return new ScanService();
        }
        return null;
    }
}
