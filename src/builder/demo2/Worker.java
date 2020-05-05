package builder.demo2;

public class Worker extends Builder {
    private Product product;

    public Worker(){
        product = new Product();
    }

    @Override
    Builder setA(String a) {
        product.setShuxingA(a);
        return this;
    }

    @Override
    Builder setB(String b) {
        product.setShuxingB(b);
        return this;
    }

    @Override
    Builder setC(String c) {
        product.setShuxingC(c);
        return this;
    }

    @Override
    Builder setD(String d) {
        product.setShuxingD(d);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
