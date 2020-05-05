package builder.demo2;




public abstract class Builder {

    abstract Builder setA(String a);
    abstract Builder setB(String b);
    abstract Builder setC(String c);
    abstract Builder setD(String d);

    abstract Product getProduct();
}
