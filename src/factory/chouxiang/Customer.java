package factory.chouxiang;

public class Customer {
    public static void main(String[] args) {

        System.out.println("购买华为系列产品--------------");
        IFactory iFactory = new HuaweiFactory();
        IPhone phone = iFactory.getPhone();
        phone.bilibli();
        phone.open();
        ITV tv = iFactory.getTv();
        tv.aiqiyi();
        tv.close();

        System.out.println("购买小米系列产品---------------");
        IFactory iFactory1 = new XiaomiFactory();
        IPhone phone1 = iFactory1.getPhone();
        phone1.bilibli();
        phone1.open();
        ITV tv1 = iFactory1.getTv();
        tv1.aiqiyi();
        tv1.close();

    }
}
