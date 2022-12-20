package example.ownClassesAndInterfaces;

public class Firebox extends ElectronicDevice {
    public Firebox(){
        this.on();
    }

    @Override public void off() {
        System.out.println("Der Feuermelder kann nicht ausgeschaltet werden!");
    }
}
