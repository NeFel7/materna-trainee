package example.classesObjectsPackages;

public class SummingCalculator {
    public static void main(String[] args) { // Aufgabe 1.5.3
        int endFlag = 0;
        int sum   = 0;
        int input = 0;

        do {
            System.out.print("Gib eine Zahl ein: ");
            input = new java.util.Scanner( System.in ).nextInt();
            sum += input;
        } while ( input != endFlag );

        System.out.println("Die Summe ist: " + sum);
    }
}
