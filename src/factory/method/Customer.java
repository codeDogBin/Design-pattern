package factory.method;

public class Customer {
    public static void main(String[] args) {

        //使用方法工厂模式获取车
        Car car = new BMWFactory().getCar();
        Car car2 = new TeslaFactory().getCar();

        car.name();
        car2.name();
    }
}
