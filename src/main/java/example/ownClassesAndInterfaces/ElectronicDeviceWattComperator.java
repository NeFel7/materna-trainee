package example.ownClassesAndInterfaces;

import java.util.Comparator;

public class ElectronicDeviceWattComperator implements Comparator<ElectronicDevice> {

    @Override
    public int compare(ElectronicDevice o1, ElectronicDevice o2) {
        System.out.println( o1.getWatt() + " is compared with " + o2.getWatt() );
        return Integer.compare(o1.getWatt(), o2.getWatt());
    }
}
