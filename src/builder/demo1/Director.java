package builder.demo1;
//指挥核心
public class Director {

    public Product build(Builder bulider){
        bulider.setA();
        bulider.setB();
        bulider.setC();
        bulider.setD();
      return  bulider.getProduct();
    }
}
