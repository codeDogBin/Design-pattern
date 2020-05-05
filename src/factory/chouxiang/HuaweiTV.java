package factory.chouxiang;

public class HuaweiTV implements ITV{
    @Override
    public void open() {
        System.out.println("华为电视开机了");
    }

    @Override
    public void close() {
        System.out.println("华为电视关机了");
    }

    @Override
    public void aiqiyi() {
        System.out.println("华为电视看爱奇艺了");
    }

    @Override
    public void openDoor() {
        System.out.println("华为电视控制开门了");
    }
}
