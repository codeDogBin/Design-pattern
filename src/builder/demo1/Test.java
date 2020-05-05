package builder.demo1;



public class Test {
    public static void main(String[] args) {

        Director director = new Director();
        Worker worker = new Worker();
        Product build = director.build(worker);
        System.out.println(build);
    }

}
