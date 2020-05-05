package factory.simple;

public class Customer {
    public static void main(String[] args) {
        //使用原始的方法获取车
        //需要了解接口 和 所有的实现类
//        Car car = new BWM();
//        Car car2 = new Tesla();
        //使用工厂模式获取车
        Car car = CarFactory.getCar("宝马");
        Car car2 = CarFactory.getCar("特斯拉");

        car.name();
        car2.name();
    }
}
