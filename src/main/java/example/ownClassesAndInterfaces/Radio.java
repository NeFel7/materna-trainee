package example.ownClassesAndInterfaces;

import java.util.Objects;

public class Radio extends ElectronicDevice {
    public enum Modulation {
        AM, FM
    }

    private int volume;
    private double frequency;
    private Modulation modulation = Modulation.AM;

    public Radio() {
    }

    public Radio(double frequency) {
        setFrequency(frequency);
    }

    public Radio(String stationName) {
        this(stationNameToFrequency(stationName));
    }

    public Radio(Radio other) {
        Objects.requireNonNull(other);
        setFrequency(other.frequency);
        setModulation(other.getModulation());
        this.volume = other.volume;
        this.isOn = other.isOn;
    }

    public void setModulation(Modulation modulation) {
        this.modulation = Objects.requireNonNull(modulation);
    }

    public Modulation getModulation() {
        return modulation;
    }

    public static double stationNameToFrequency(String stationName) {

        if (stationName == null)
            return 0.0;

        return switch (stationName.trim().toLowerCase()) {
            case "walking the plank" -> 98.3;
            case "BFBS" -> 76.4;
            case "1live" -> 102.4;
            case "radio köln" -> 107.1;
            default -> 0.0;
        };
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }

    void changeVolume(int value) {
        int a = Math.max(volume + value, 0);
        volume = (a <= 100) ? a : 100;
    }

    public int getVolume() {
        return volume;
    }

    void volumeUp() {
        changeVolume(1);
    }

    void volumeDown() {
        changeVolume(-1);
    }

    @Override
    public String toString() {
        return "Radio{" +
                "volume=" + volume +
                ", frequency=" + frequency +
                ", modulation=" + modulation +
                "} " + super.toString();
    }
}
