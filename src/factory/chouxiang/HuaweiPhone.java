package factory.chouxiang;

public class HuaweiPhone implements IPhone{
    @Override
    public void open() {
        System.out.println("华为手机开机了");
    }

    @Override
    public void close() {
        System.out.println("华为手机关机了");
    }

    @Override
    public void bilibli() {
        System.out.println("华为手机看哔哩哔哩");
    }

    @Override
    public void palyGame() {
        System.out.println("华为手机玩游戏");
    }
}
