package factory.method;

public class HondaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Honda();
    }
}
