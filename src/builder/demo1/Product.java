package builder.demo1;
//产品
public class Product {

    private String shuxingA;
    private String shuxingB;
    private String shuxingC;
    private String shuxingD;

    public String getShuxingA() {
        return shuxingA;
    }

    @Override
    public String toString() {
        return "Product{" +
                "shuxingA='" + shuxingA + '\'' +
                ", shuxingB='" + shuxingB + '\'' +
                ", shuxingC='" + shuxingC + '\'' +
                ", shuxingD='" + shuxingD + '\'' +
                '}';
    }

    public void setShuxingA(String shuxingA) {
        this.shuxingA = shuxingA;
    }

    public String getShuxingB() {
        return shuxingB;
    }

    public void setShuxingB(String shuxingB) {
        this.shuxingB = shuxingB;
    }

    public String getShuxingC() {
        return shuxingC;
    }

    public void setShuxingC(String shuxingC) {
        this.shuxingC = shuxingC;
    }

    public String getShuxingD() {
        return shuxingD;
    }

    public void setShuxingD(String shuxingD) {
        this.shuxingD = shuxingD;
    }


}
