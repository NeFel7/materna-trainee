package example.ownClassesAndInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Ship {
    private ArrayList<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();

    public ElectronicDevice findMostPowerConsumingElectronicDevice() {
        return Collections.max(devices, new ElectronicDeviceWattComperator());
    }

    public void load(ElectronicDevice device) {
        if (device instanceof Radio radio) {
            if (((Radio) device).getVolume() != 0) {
                devices.add(Objects.requireNonNull(radio));
                System.out.println("Remember to pay license fee!");
            }
        } else {
            devices.add(Objects.requireNonNull(device));
        }
        devices.sort(new ElectronicDeviceWattComperator());
        System.out.println(devices.toString());
    }

    public int countDevicesSwitchedOn() {
        int result = 0;
        for (ElectronicDevice device : devices) {
            if (device.isOn) {
                result++;
            }
        }
        return result;
    }

    public String toString() {
        return "Ship[" + devices + "]";
    }

    public void holiday() {
        for (ElectronicDevice device : devices) {
            device.off();
        }
    }
}
