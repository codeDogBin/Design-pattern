package factory.chouxiang;

public class XiaomiPhone implements IPhone {
    @Override
    public void open() {
        System.out.println("小米手机开机了");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机了");
    }

    @Override
    public void bilibli() {
        System.out.println("小米手机看哔哩哔哩");
    }

    @Override
    public void palyGame() {
        System.out.println("小米手机玩游戏");
    }
}
