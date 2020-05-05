package builder.demo1;

//抽象的构造器
public abstract class Builder {

    abstract void setA();
    abstract void setB();
    abstract void setC();
    abstract void setD();

    abstract Product getProduct();
}
