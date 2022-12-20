package example.ownClassesAndInterfaces;

import java.util.Comparator;
import java.util.Timer;

public class Application {
    public static void main(String[] args) {
        Radio grannysRadio = new Radio();
        grannysRadio.volumeUp();
        grannysRadio.setWatt( 1000 );

        TV grandpasTv = new TV();
        grandpasTv.setWatt( 12_500 );

        Ship ship = new Ship();
        ship.load( grannysRadio );
        ship.load( grandpasTv );
        System.out.println( ship.findMostPowerConsumingElectronicDevice().getWatt() );
    }
}