package singleton;

/**
 * 静态内部类
 */
public class Holder {

    private Holder(){}

    public static  Holder getInstance(){
        return InnerClass.HOLDER;
    }
    //静态内部类
    static class InnerClass{
        private static final Holder HOLDER = new Holder();
    }
}
