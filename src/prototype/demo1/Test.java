package prototype.demo1;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Dog d1 = new Dog("泰迪", date);
        Dog d2 = (Dog) d1.clone();
        System.out.println("d1:"+d1+"+hash:"+d1.hashCode());
        System.out.println("d2:"+d2+"+hash:"+d2.hashCode());
        System.out.println("修改d2---------------------");
        d2.setName("京巴");
        date.setTime(123654897);
        System.out.println("d1:"+d1+"+hash:"+d1.hashCode());
        System.out.println("d2:"+d2+"+hash:"+d2.hashCode());
    }
}
