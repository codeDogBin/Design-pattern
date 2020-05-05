package builder.demo1;
//真正干活的人
public class Worker extends Builder {

    private Product product ;

    public Worker() {
        this.product =new Product();
    }

    @Override
    void setA() {
        System.out.println("设置属性A");
        product.setShuxingA("属性A");
    }

    @Override
    void setB() {
        System.out.println("设置属性B");
        product.setShuxingB("属性B");
    }

    @Override
    void setC() {
        System.out.println("设置属性C");
        product.setShuxingC("属性C");
    }

    @Override
    void setD() {
        System.out.println("设置属性D");
        product.setShuxingD("属性D");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
