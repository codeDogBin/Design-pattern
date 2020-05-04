package sington;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//枚举类 枚举是什么 枚本身也是一个class类
public enum EnumSingle {

    INSTANCE ;

    public static EnumSingle getInstance(){
        return INSTANCE;
    }
}
class Test{
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        EnumSingle enumSingle1 = EnumSingle.INSTANCE;
        EnumSingle enumSingle = EnumSingle.getInstance();
        System.out.println(enumSingle1);
        System.out.println(enumSingle);


        Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(String.class,int.class);
        declaredConstructor.setAccessible(true);
        EnumSingle enumSingle2 = declaredConstructor.newInstance();
        System.out.println(enumSingle1);
        System.out.println(enumSingle2);
    }
}
