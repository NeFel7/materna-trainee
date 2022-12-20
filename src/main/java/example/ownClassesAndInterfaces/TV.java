package example.ownClassesAndInterfaces;

public class TV extends ElectronicDevice {
    MonitorTube tube = new MonitorTube(this);

    @Override public void on() {
        super.isOn = true;
        System.out.println("TV ist an!");
        tube.on();
    }
    @Override public void off() {
        super.isOn = false;
        System.out.println("TV ist aus!");
        tube.off();
    }
}

class MonitorTube {
    private TV tv;
    public MonitorTube(TV tv) {
        this.tv = tv;
    }
    public TV getTv() {
        return tv;
    }
    public void on() {
        System.out.println("Bildröhre ist an!");
    }
    public void off() {
        System.out.println("Bildröhre ist aus!");
    }
}
