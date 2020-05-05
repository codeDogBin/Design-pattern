package factory.chouxiang;

public class XiaomiFactory implements IFactory{
    @Override
    public IPhone getPhone() {
        return new XiaomiPhone();
    }

    @Override
    public ITV getTv() {
        return new XiaomiTV();
    }
}
