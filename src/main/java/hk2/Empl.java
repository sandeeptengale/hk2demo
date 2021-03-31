package hk2;

public class Empl implements Employee {
    private String name = "sandeep";
    private String dept = "tengale";

    @Override
    public void print() {
        System.out.println(name + " " + dept);
    }
}
