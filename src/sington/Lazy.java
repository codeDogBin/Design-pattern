package sington;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 懒汉式的单例模式
 */
public class Lazy {

    //私有的静态的对象
    private static Lazy lazy;

    //使用volatile修饰的原子性私有静态lazy对象
    private volatile static Lazy lazy1;

    //私有的构造器
    private Lazy(){

    }

    //公开的获取对象的方法 单线程
    public static Lazy getLazy1(){
        if (lazy == null){
            lazy = new Lazy();
        }
        return lazy;
    }

    //测试在单例模式下的获取
    public static void test1(){
        Lazy lazy1 = getLazy1();
        Lazy lazy2 = getLazy1();
        System.out.println(lazy1);
        System.out.println(lazy2);
    }

    //测试在多线程下的的单例实现
    public static void test2(){
        for (int i = 0; i < 10 ; i++) {
            new Thread(()->{//此处使用lambda表达式
                Lazy lazy=Lazy.getLazy1();
                System.out.println(lazy);
            }).start();
        }
    }


    //公开的获取对象的方法 synchronized 加锁
    public static synchronized Lazy getLazy2(){
        if (lazy == null){
            lazy = new Lazy();
        }
        return lazy;
    }


    //测试在多线程下的的单例实现
    public static void test3(){
        for (int i = 0; i < 10 ; i++) {
            new Thread(()->{//此处使用lambda表达式
                Lazy lazy=Lazy.getLazy2();
                System.out.println(lazy);
            }).start();
        }
    }

    //测试synchronized锁下 10000次获取对象的速度
    public static void test4(){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{//此处使用lambda表达式
                Lazy lazy=Lazy.getLazy2();
            }).start();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }


    //双重检测锁模式的懒汉式单例 DCL模式
    public static Lazy getLazy3(){
        if (lazy1 == null){
            synchronized (Lazy.class){//将类对象锁定 其他线程无法获取类
                if (lazy1 == null){
                    lazy1 = new Lazy();
                }
            }
        }
        return lazy1;
    }

    /*
    关于上述方法的解释
    在对象创建时 会有以下几个步骤
    1.分配内存空间
    2.执行构造方法 初始化对象
    3.把这个对象指向这个空间
    但是这个步骤不是确定的
    123的情况下不会出错
    假如线程A的执行顺序是132 当A线程执行完3还没执行2的时候
    线程B也加入进来 此时判断lazy是否为空时 会认为是非空,但是lazy对象此时是空
    所以需要假如volatile特征符 禁止指令重排,这样必须用123的顺序执行
    此处我新建了一个成员变量加入了volatile特征符
     */

    //测试DCL模式下多线程单例
    public static void test5(){
        for (int i = 0; i < 10 ; i++) {
            new Thread(()->{//此处使用lambda表达式
                Lazy lazy=Lazy.getLazy3();
                System.out.println(lazy);
            }).start();
        }
    }

    //测试DCL模式下多线程单例
    public static void test6(){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000 ; i++) {
            new Thread(()->{//此处使用lambda表达式
                Lazy lazy=Lazy.getLazy3();
            }).start();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }


    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //测试在单例模式下的获取
//        test1();
        //测试在多线程下的的单例实现
//        test2();
        //测试在多线程下的的单例实现
//        test3();
        //测试synchronized锁下 10000次获取对象的速度
//        test4();
        //测试双重检测单例模式
//        test5();
        //测试双重检测单例模式 10000次获取对象的速度
//        test6();

        //利用反射破坏单例模式
        //获取一个对象
        Lazy lazy = Lazy.getLazy3();
        //获取空参构造器
        Constructor<Lazy> declaredConstructor = Lazy.class.getDeclaredConstructor(null);
        //获取私有的
        declaredConstructor.setAccessible(true);
        //使用无参构造器
        Lazy lazy2 = declaredConstructor.newInstance();
        System.out.println(lazy);
        System.out.println(lazy2);

    }
}
