package factory.method;


public class Honda implements Car {
    @Override
    public void name() {
        System.out.println("本田");
    }
}