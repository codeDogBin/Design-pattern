package sington;

/**
 * 饿汉式单例模式
 */
public class Hungry {

    //私有的不可变的静态对象
    private final static Hungry HUNGRY = new Hungry();
    //私有化构造器
    private Hungry() {
    }
    //公共的获取对象方法
    public static Hungry getHungry(){
        return  HUNGRY;
    }
    //缺点:程序启动就会创建对象 会造成内存的浪费

}
