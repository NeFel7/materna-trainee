package example.ownClassesAndInterfaces;

abstract public class ElectronicDevice {
    private int watt;
    public boolean isOn;

    public void on() {
        isOn = true;
    }

    public void off() {
        isOn = false;
    }

    boolean isOn() {
        return isOn;
    }

    public int getWatt() {
        return watt;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }

    @Override
    public String toString() {
        return "ElectronicDevice{" +
                "watt=" + watt +
                '}';
    }

    public static int numberOfElectronicDevicesSwitchedOn(ElectronicDevice... devices) {
        int count = 0;

        for (ElectronicDevice device : devices)
            if (device.isOn) {
                count++;
            }
        return count;
    }
}

