package factory.chouxiang;

public class HuaweiFactory implements IFactory{
    @Override
    public IPhone getPhone() {
        return new HuaweiPhone();
    }

    @Override
    public ITV getTv() {
        return new HuaweiTV();
    }
}
