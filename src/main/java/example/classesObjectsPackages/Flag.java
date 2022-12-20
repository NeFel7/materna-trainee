package example.classesObjectsPackages;

public class Flag {
    public static void main(String[] args) { // Aufgabe 1.5.8
        System.out.print("Wie groß soll die Flagge sein: ");
        int max = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i <= max; i++) {
            for (int before = 0; before < (max - i); before++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.print("\n");

        }
    }
}
