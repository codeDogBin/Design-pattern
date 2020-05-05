package builder.demo2;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Product product = worker.setA("属性A").setB("属性B").getProduct();
        System.out.println(product.toString());
    }
}
